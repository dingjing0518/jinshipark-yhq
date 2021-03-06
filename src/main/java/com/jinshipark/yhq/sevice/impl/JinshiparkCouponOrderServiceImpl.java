package com.jinshipark.yhq.sevice.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinshipark.yhq.mapper.JinshiparkCouponMapper;
import com.jinshipark.yhq.mapper.JinshiparkCouponOrderHistoryMapper;
import com.jinshipark.yhq.mapper.JinshiparkCouponOrderMapper;
import com.jinshipark.yhq.mapper2.JinshiAreaMapper;
import com.jinshipark.yhq.mapper2.LincensePlateMapper;
import com.jinshipark.yhq.model.*;
import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.model.vo.JinshiparkCouponOrderVO;
import com.jinshipark.yhq.sevice.JinshiparkCouponOrderService;
import com.jinshipark.yhq.utils.DateUtils;
import com.jinshipark.yhq.utils.PagedGridResult;
import com.jinshipark.yhq.utils.TestUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class JinshiparkCouponOrderServiceImpl implements JinshiparkCouponOrderService {
    @Autowired
    private JinshiparkCouponOrderMapper jinshiparkCouponOrderMapper;

    @Autowired
    private JinshiparkCouponMapper jinshiparkCouponMapper;

    @Autowired
    private LincensePlateMapper lincensePlateMapper;

    @Autowired
    private JinshiparkCouponOrderHistoryMapper jinshiparkCouponOrderHistoryMapper;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public PagedGridResult searchCouponOrder(SearchVO searchVO) throws ParseException {
        List<JinshiparkCouponOrderVO> jinshiparkCouponOrderVOS = new ArrayList<>();
        JinshiparkCouponOrderExample example = new JinshiparkCouponOrderExample();
        JinshiparkCouponOrderExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("CreateTime desc");
        criteria.andShopidEqualTo(searchVO.getShopId());
        criteria.andParkidEqualTo(searchVO.getParkId());
        criteria.andCreatetimeGreaterThanOrEqualTo(searchVO.getDateForStartTime());
        criteria.andCreatetimeLessThanOrEqualTo(searchVO.getDateForEndTime());
        criteria.andPlateLike("%" + searchVO.getKeyWord() + "%");
        // 分页
        PageHelper.startPage(searchVO.getPageNum(), searchVO.getPageSize());
        List<JinshiparkCouponOrder> jinshiparkCouponOrders = jinshiparkCouponOrderMapper.selectByExample(example);
        for (JinshiparkCouponOrder jinshiparkCouponOrder : jinshiparkCouponOrders) {
            JinshiparkCouponOrderVO jinshiparkCouponOrderVO = new JinshiparkCouponOrderVO();
            BeanUtils.copyProperties(jinshiparkCouponOrder, jinshiparkCouponOrderVO);
            jinshiparkCouponOrderVOS.add(jinshiparkCouponOrderVO);
        }
        PageInfo<?> pageList = new PageInfo<>(jinshiparkCouponOrders);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(searchVO.getPageNum());
        grid.setRows(jinshiparkCouponOrderVOS);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }

    @Override
    public String insertCouponOrder(Integer id, String plate, Integer type, String orderId, Integer num) throws Exception {
        JSONObject jsonObject = new JSONObject();
        if (StringUtils.isNotBlank(orderId) && num != null && num > 0) {
            JinshiparkCouponOrderExample orderExample = new JinshiparkCouponOrderExample();
            JinshiparkCouponOrderExample.Criteria orderCriteria = orderExample.createCriteria();
            orderCriteria.andOrderidEqualTo(orderId);
            long orderCount = jinshiparkCouponOrderMapper.countByExample(orderExample);

            JinshiparkCouponOrderHistoryExample historyExample = new JinshiparkCouponOrderHistoryExample();
            JinshiparkCouponOrderHistoryExample.Criteria historyCriteria = historyExample.createCriteria();
            historyCriteria.andOrderidEqualTo(orderId);
            long historyCount = jinshiparkCouponOrderHistoryMapper.countByExample(historyExample);

            if ((orderCount + historyCount) >= num) {
                jsonObject.put("msg", "超过二维码扫码次数限制");
                return jsonObject.toJSONString();
            }
        }
        if (type == null) {
            jsonObject.put("msg", "扫码失败，请联系工作人员更换二维码");
            return jsonObject.toJSONString();
        }
        JinshiparkCoupon jinshiparkCoupon = jinshiparkCouponMapper.selectByPrimaryKey(id);
        String parkid = jinshiparkCoupon.getParkid();
        String areaid = jinshiparkCoupon.getAreaid();

        Date startdate = jinshiparkCoupon.getStartdate();//开始日期
        Date enddate = jinshiparkCoupon.getEnddate();//结束日期
        String starttime = jinshiparkCoupon.getStarttime();//开始时间
        String endtime = jinshiparkCoupon.getEndtime();//结束时间
        Date date = new Date();
        boolean afterStartdate = date.after(startdate);
        boolean beforeEnddate = date.before(enddate);
        //返回今天的优惠券有效时间 boolean 值
        JSONObject js = returnTodayTime(starttime, endtime);
        boolean afterStarttime = (boolean) js.get("after");
        boolean beforEndtime = (boolean) js.get("before");

        if (!afterStartdate || !beforeEnddate) {
            jsonObject.put("msg", "此优惠券不在有效期内");
            return jsonObject.toJSONString();
        }
        if (!afterStarttime || !beforEndtime) {
            jsonObject.put("msg", "此优惠券不在扫码时间范围内");
            return jsonObject.toJSONString();
        }
        //商家优惠券数量不足
        if (Integer.parseInt(jinshiparkCoupon.getRemaincount()) <= 0) {
            jsonObject.put("msg", "商家优惠券数量不足");
            return jsonObject.toJSONString();
        }

        LincensePlateExample lincensePlateExample = new LincensePlateExample();
        LincensePlateExample.Criteria criteriasLp = lincensePlateExample.createCriteria();
        criteriasLp.andLpLincensePlateIdCarEqualTo(plate);

        List<LincensePlate> lincensePlates = lincensePlateMapper.selectByExample(lincensePlateExample);

        if (lincensePlates.size() == 0) {
            jsonObject.put("msg", "该车辆无入场信息");
            return jsonObject.toJSONString();
        }
        LincensePlate lincensePlate = lincensePlates.get(0);
        if (!lincensePlate.getLpParkingName().equals(parkid)
                || (!jinshiparkCoupon.getAreaname().equals("全区域") && !lincensePlate.getLpCarType().equals(jinshiparkCoupon.getAreaname()))) {
            jsonObject.put("msg", "本优惠券不在该停车区域使用范围");
            return jsonObject.toJSONString();
        }
        if (lincensePlate.getLpLgType() == 1) {
            jsonObject.put("msg", "此车辆为月租车，无需使用优惠券");
            return jsonObject.toJSONString();
        }
        JinshiparkCouponOrderExample jinshiparkCouponOrderExample = new JinshiparkCouponOrderExample();
        JinshiparkCouponOrderExample.Criteria criteria = jinshiparkCouponOrderExample.createCriteria();
        criteria.andPlateEqualTo(plate);
        criteria.andStateEqualTo("0");
        List<JinshiparkCouponOrder> jinshiparkCouponOrders = jinshiparkCouponOrderMapper.selectByExample(jinshiparkCouponOrderExample);

        if (jinshiparkCouponOrders.size() != 0) {
            jsonObject.put("msg", "此车牌已增加,请勿重复提交");
            return jsonObject.toJSONString();
        }
        if (type == 3) {
            DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String datestr = formatDate.format(date);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(datestr);
            stringBuilder.append(" ");
            stringBuilder.append("00:00:00");
            if (lincensePlate.getLpInboundTime().before(format.parse(stringBuilder.toString()))) {
                jsonObject.put("msg", "请在进场当天使用优惠券并出场");
                return jsonObject.toJSONString();
            }
        }
        JinshiparkCouponOrder jinshiparkCouponOrder = new JinshiparkCouponOrder();
        jinshiparkCouponMapper.updateCount(jinshiparkCoupon);
        jinshiparkCouponOrder.setState("0");
        jinshiparkCouponOrder.setCouponid(jinshiparkCoupon.getCouponid());
        jinshiparkCouponOrder.setPlate(plate);
        jinshiparkCouponOrder.setCreatetime(new Date());
        jinshiparkCouponOrder.setAgentid(jinshiparkCoupon.getAgentid());
        jinshiparkCouponOrder.setParkid(parkid);
        jinshiparkCouponOrder.setAreaid(areaid);
        jinshiparkCouponOrder.setJcoCouponGenerateId(id);
        jinshiparkCouponOrder.setShopid(jinshiparkCoupon.getShopid());
        jinshiparkCouponOrder.setType(String.valueOf(jinshiparkCoupon.getType()));
        jinshiparkCouponOrder.setReductionmoney(String.valueOf(jinshiparkCoupon.getReductionmoney()));
        jinshiparkCouponOrder.setReductiontime(String.valueOf(jinshiparkCoupon.getReductiontime()));
        jinshiparkCouponOrder.setIntime(lincensePlate.getLpInboundTime());
        jinshiparkCouponOrder.setAreaname(jinshiparkCoupon.getAreaname());

        if (StringUtils.isNotBlank(orderId)) {
            jinshiparkCouponOrder.setOrderid(orderId);
        } else {
            jinshiparkCouponOrder.setOrderid(lincensePlate.getLpOrderId());
        }

        int result = jinshiparkCouponOrderMapper.insertSelective(jinshiparkCouponOrder);
        if (result > 0) {
            jsonObject.put("msg", "使用优惠券成功");
            return jsonObject.toJSONString();
        }
        jsonObject.put("msg", "使用优惠券失败");
        return jsonObject.toJSONString();
    }

    @Override
    public String insertCouponOrderToD(Integer id, String plate, Integer type) throws Exception {
        JSONObject jsonObject = new JSONObject();
        if (type == null) {
            jsonObject.put("msg", "扫码失败，请联系工作人员更换二维码");
            return jsonObject.toJSONString();
        }
        JinshiparkCoupon jinshiparkCoupon = jinshiparkCouponMapper.selectByPrimaryKey(id);
        String parkid = jinshiparkCoupon.getParkid();
        String areaid = jinshiparkCoupon.getAreaid();

        Date startdate = jinshiparkCoupon.getStartdate();//开始日期
        Date enddate = jinshiparkCoupon.getEnddate();//结束日期
        String starttime = jinshiparkCoupon.getStarttime();//开始时间
        String endtime = jinshiparkCoupon.getEndtime();//结束时间
        Date date = new Date();
        boolean afterStartdate = date.after(startdate);
        boolean beforeEnddate = date.before(enddate);
        //返回今天的优惠券有效时间 boolean 值
        JSONObject js = returnTodayTime(starttime, endtime);
        boolean afterStarttime = (boolean) js.get("after");
        boolean beforEndtime = (boolean) js.get("before");

        if (!afterStartdate || !beforeEnddate) {
            jsonObject.put("msg", "此优惠券不在有效期内");
            return jsonObject.toJSONString();
        }
        if (!afterStarttime || !beforEndtime) {
            jsonObject.put("msg", "此优惠券不在扫码时间范围内");
            return jsonObject.toJSONString();
        }
        //商家优惠券数量不足
        if (Integer.parseInt(jinshiparkCoupon.getRemaincount()) <= 0) {
            jsonObject.put("msg", "商家优惠券数量不足");
            return jsonObject.toJSONString();
        }

        LincensePlateExample lincensePlateExample = new LincensePlateExample();
        LincensePlateExample.Criteria criteriasLp = lincensePlateExample.createCriteria();
        criteriasLp.andLpLincensePlateIdCarEqualTo(plate);

        List<LincensePlate> lincensePlates = lincensePlateMapper.selectByExample(lincensePlateExample);

        if (lincensePlates.size() == 0) {
            jsonObject.put("msg", "该车辆无入场信息");
            return jsonObject.toJSONString();
        }
        LincensePlate lincensePlate = lincensePlates.get(0);
        if (!lincensePlate.getLpParkingName().equals(parkid)
                || (!jinshiparkCoupon.getAreaname().equals("全区域") && !lincensePlate.getLpCarType().equals(jinshiparkCoupon.getAreaname()))) {
            jsonObject.put("msg", "本优惠券不在该停车区域使用范围");
            return jsonObject.toJSONString();
        }
        if (lincensePlate.getLpLgType() == 1) {
            jsonObject.put("msg", "此车辆为月租车，无需使用优惠券");
            return jsonObject.toJSONString();
        }
        JinshiparkCouponOrderExample jinshiparkCouponOrderExample = new JinshiparkCouponOrderExample();
        JinshiparkCouponOrderExample.Criteria criteria = jinshiparkCouponOrderExample.createCriteria();
        criteria.andPlateEqualTo(plate);
        criteria.andStateEqualTo("0");
        List<JinshiparkCouponOrder> jinshiparkCouponOrders = jinshiparkCouponOrderMapper.selectByExample(jinshiparkCouponOrderExample);

        if (jinshiparkCouponOrders.size() != 0) {
            jsonObject.put("msg", "此车牌已增加,请勿重复提交");
            return jsonObject.toJSONString();
        }
        if (type == 3) {
            DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String datestr = formatDate.format(date);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(datestr);
            stringBuilder.append(" ");
            stringBuilder.append("00:00:00");
            if (lincensePlate.getLpInboundTime().before(format.parse(stringBuilder.toString()))) {
                jsonObject.put("msg", "请在进场当天使用优惠券并出场");
                return jsonObject.toJSONString();
            }
        }
        JinshiparkCouponOrder jinshiparkCouponOrder = new JinshiparkCouponOrder();
        jinshiparkCouponMapper.updateCount(jinshiparkCoupon);
        jinshiparkCouponOrder.setState("0");
        jinshiparkCouponOrder.setCouponid(jinshiparkCoupon.getCouponid());
        jinshiparkCouponOrder.setPlate(plate);
        jinshiparkCouponOrder.setCreatetime(new Date());
        jinshiparkCouponOrder.setAgentid(jinshiparkCoupon.getAgentid());
        jinshiparkCouponOrder.setParkid(parkid);
        jinshiparkCouponOrder.setJcoCouponGenerateId(id);
        jinshiparkCouponOrder.setShopid(jinshiparkCoupon.getShopid());
        jinshiparkCouponOrder.setType(String.valueOf(jinshiparkCoupon.getType()));
        jinshiparkCouponOrder.setReductionmoney(String.valueOf(jinshiparkCoupon.getReductionmoney()));
        jinshiparkCouponOrder.setReductiontime(String.valueOf(jinshiparkCoupon.getReductiontime()));
        jinshiparkCouponOrder.setIntime(lincensePlate.getLpInboundTime());
        jinshiparkCouponOrder.setOrderid(lincensePlate.getLpOrderId());
        jinshiparkCouponOrder.setAreaid(areaid);
        jinshiparkCouponOrder.setAreaname(jinshiparkCoupon.getAreaname());

        int result = jinshiparkCouponOrderMapper.insertSelective(jinshiparkCouponOrder);
        if (result > 0) {
            jsonObject.put("msg", "使用优惠券成功");
            return jsonObject.toJSONString();
        }
        jsonObject.put("msg", "使用优惠券失败");
        return jsonObject.toJSONString();
    }

    public JSONObject returnTodayTime(String starttime, String endtime) throws Exception {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        JSONObject js = DateUtils.subtimeToDate(starttime, endtime);
        String startTime = (String) js.get("startTime");
        String endTime = (String) js.get("endTime");
        Date startDateTime = format.parse(startTime);
        Date endDateTime = format.parse(endTime);
        Date date = new Date();
        boolean after = date.after(startDateTime);
        boolean before = date.before(endDateTime);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("after", after);
        jsonObject.put("before", before);
        return jsonObject;
    }
}
