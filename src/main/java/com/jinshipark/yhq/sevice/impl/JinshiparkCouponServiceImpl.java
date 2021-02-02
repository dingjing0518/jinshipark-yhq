package com.jinshipark.yhq.sevice.impl;

import com.jinshipark.yhq.mapper.JinshiparkCouponMapper;
import com.jinshipark.yhq.mapper.JinshiparkShopcouponMapper;
import com.jinshipark.yhq.model.JinshiparkCoupon;
import com.jinshipark.yhq.model.JinshiparkCouponExample;
import com.jinshipark.yhq.model.JinshiparkShopcoupon;
import com.jinshipark.yhq.model.JinshiparkShopcouponExample;
import com.jinshipark.yhq.model.bo.JinshiparkCouponBO;
import com.jinshipark.yhq.sevice.JinshiparkCouponService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class JinshiparkCouponServiceImpl implements JinshiparkCouponService {

    @Autowired
    private JinshiparkCouponMapper jinshiparkCouponMapper;

    @Autowired
    private JinshiparkShopcouponMapper jinshiparkShopcouponMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult list(JinshiparkCouponBO jinshiparkCouponBO) {
        JinshiparkCouponExample example = new JinshiparkCouponExample();
        JinshiparkCouponExample.Criteria criteria = example.createCriteria();
        criteria.andShopidEqualTo(jinshiparkCouponBO.getShopid());
        criteria.andParkidEqualTo(jinshiparkCouponBO.getParkid());
        List<JinshiparkCoupon> result = jinshiparkCouponMapper.selectByExample(example);
        return JinshiparkJSONResult.ok(result);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public JinshiparkJSONResult save(JinshiparkCouponBO jinshiparkCouponBO) throws ParseException {

        JinshiparkShopcoupon jinshiparkShopcoupon = jinshiparkShopcouponMapper.selectByPrimaryKey(Integer.valueOf(jinshiparkCouponBO.getCouponId()));
        if (jinshiparkCouponBO.getCoupontype() == 0 || jinshiparkCouponBO.getCoupontype() == 3) {
            if (jinshiparkShopcoupon.getRemaincount() < jinshiparkCouponBO.getCount()) {
                return JinshiparkJSONResult.errorMsg("您所剩减免优惠券没有这么多");
            }
            jinshiparkCouponBO.setReductionmoney(0);
            jinshiparkCouponBO.setReductiontime(0);
            jinshiparkShopcoupon.setRemaincount(jinshiparkShopcoupon.getRemaincount() - jinshiparkCouponBO.getCount());
        } else if (jinshiparkCouponBO.getCoupontype() == 1) {
            Integer addTotal = jinshiparkCouponBO.getCount() * jinshiparkCouponBO.getReductiontime();
            if (addTotal > jinshiparkShopcoupon.getRemaincount()) {
                return JinshiparkJSONResult.errorMsg("总时长不能大于剩余时长");
            }
            jinshiparkCouponBO.setReductionmoney(0);
            jinshiparkShopcoupon.setRemaincount(jinshiparkShopcoupon.getRemaincount() - addTotal);
        } else if (jinshiparkCouponBO.getCoupontype() == 2) {
            Integer addTotal = jinshiparkCouponBO.getCount() * jinshiparkCouponBO.getReductionmoney();
            if (addTotal > jinshiparkShopcoupon.getRemaincount()) {
                return JinshiparkJSONResult.errorMsg("总金额不能大于剩余金额");
            }
            jinshiparkCouponBO.setReductiontime(0);
            jinshiparkShopcoupon.setRemaincount(jinshiparkShopcoupon.getRemaincount() - addTotal);
        }
        JinshiparkCoupon jinshiparkCoupon = new JinshiparkCoupon();
        BeanUtils.copyProperties(jinshiparkCouponBO, jinshiparkCoupon);
        jinshiparkCoupon.setCouponid(jinshiparkCouponBO.getCouponId());
        jinshiparkCoupon.setName(jinshiparkCouponBO.getCouponname());
        jinshiparkCoupon.setType(jinshiparkCouponBO.getCoupontype());
        jinshiparkCoupon.setStartdate(jinshiparkCouponBO.getDateForStartdata());
        jinshiparkCoupon.setEnddate(jinshiparkCouponBO.getDateForEnddata());
        jinshiparkCoupon.setCreatetime(new Date());
        jinshiparkCoupon.setRemaincount(String.valueOf(jinshiparkCoupon.getCount()));
        int result = jinshiparkCouponMapper.insert(jinshiparkCoupon);
        if (result < 1) {
            JinshiparkJSONResult.errorMsg("生成优惠券失败");
        }
        jinshiparkShopcouponMapper.updateByPrimaryKey(jinshiparkShopcoupon);
        return JinshiparkJSONResult.ok("生成优惠券成功");
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult selectParkCouponById(JinshiparkCouponBO jinshiparkCouponBO) {
        JinshiparkCoupon jinshiparkCoupon = jinshiparkCouponMapper.selectByPrimaryKey(jinshiparkCouponBO.getId());
        return JinshiparkJSONResult.ok(jinshiparkCoupon);
    }

    @Override
    public JinshiparkJSONResult updateCoupon(JinshiparkCouponBO jinshiparkCouponBO) {
        //获取生成的优惠券
        JinshiparkCouponExample jinshiparkCouponExample = new JinshiparkCouponExample();
        JinshiparkCouponExample.Criteria jinshiparkCouponExampleCriteria = jinshiparkCouponExample.createCriteria();
        jinshiparkCouponExampleCriteria.andIdEqualTo(jinshiparkCouponBO.getId());
        List<JinshiparkCoupon> jinshiparkCouponList = jinshiparkCouponMapper.selectByExample(jinshiparkCouponExample);
        if (jinshiparkCouponList.size() == 0) {
            return JinshiparkJSONResult.errorMsg("生成的优惠券不存在");
        }
        JinshiparkCoupon jinshiparkCoupon = jinshiparkCouponList.get(0);
        //获取优惠券
        JinshiparkShopcouponExample jinshiparkShopcouponExample = new JinshiparkShopcouponExample();
        JinshiparkShopcouponExample.Criteria jinshiparkShopcouponExampleCriteria = jinshiparkShopcouponExample.createCriteria();
        jinshiparkShopcouponExampleCriteria.andIdEqualTo(Integer.valueOf(jinshiparkCoupon.getCouponid()));
        List<JinshiparkShopcoupon> jinshiparkShopcouponList = jinshiparkShopcouponMapper.selectByExample(jinshiparkShopcouponExample);
        JinshiparkShopcoupon jinshiparkShopcoupon = jinshiparkShopcouponList.get(0);
        //判断优惠券有效期
        if (jinshiparkShopcoupon.getEndtime().before(new Date())) {
            return JinshiparkJSONResult.errorMsg("优惠券已过期");
        }

        //0-全免劵 3-当天有效全免券
        if (jinshiparkCouponBO.getType() == 0 || jinshiparkCouponBO.getType() == 3) {
            if (jinshiparkCouponBO.getCount() > jinshiparkShopcoupon.getRemaincount()) {
                return JinshiparkJSONResult.errorMsg("您所剩的减免优惠券没那么多");
            }
            //更新生成优惠券的数量
            updateCouponCount(jinshiparkCouponBO, jinshiparkCoupon);
            //更新优惠券的数量
            jinshiparkShopcoupon.setRemaincount(jinshiparkShopcoupon.getRemaincount() - jinshiparkCouponBO.getCount());
            jinshiparkShopcouponMapper.updateByPrimaryKey(jinshiparkShopcoupon);
        } else if (jinshiparkCouponBO.getType() == 1) {
            //1-减免时长
            Integer toAddReductiontime = jinshiparkCouponBO.getCount() * jinshiparkCoupon.getReductiontime();
            if (toAddReductiontime > jinshiparkShopcoupon.getRemaincount()) {
                return JinshiparkJSONResult.errorMsg("您所剩的减免时长券没那么多");
            }
            //更新生成优惠券的数量
            updateCouponCount(jinshiparkCouponBO, jinshiparkCoupon);

            //更新优惠券的数量
            jinshiparkShopcoupon.setRemaincount(jinshiparkShopcoupon.getRemaincount() - toAddReductiontime);
            jinshiparkShopcouponMapper.updateByPrimaryKey(jinshiparkShopcoupon);
        } else if (jinshiparkCouponBO.getType() == 2) {
            //1-减免金额
            Integer toAddReductionmoney = jinshiparkCouponBO.getCount() * jinshiparkCoupon.getReductionmoney();
            if (toAddReductionmoney > jinshiparkShopcoupon.getRemaincount()) {
                return JinshiparkJSONResult.errorMsg("您所剩的减免金额券没那么多");
            }
            //更新生成优惠券的数量
            updateCouponCount(jinshiparkCouponBO, jinshiparkCoupon);
            //更新优惠券的数量
            jinshiparkShopcoupon.setRemaincount(jinshiparkShopcoupon.getRemaincount() - toAddReductionmoney);
            jinshiparkShopcouponMapper.updateByPrimaryKey(jinshiparkShopcoupon);
        }
        return JinshiparkJSONResult.ok("优惠券续费成功");
    }

    private void updateCouponCount(JinshiparkCouponBO jinshiparkCouponBO, JinshiparkCoupon jinshiparkCoupon) {
        String newRemaincount = String.valueOf(Integer.parseInt(jinshiparkCoupon.getRemaincount()) + jinshiparkCouponBO.getCount());
        Integer newCount = jinshiparkCoupon.getCount() + jinshiparkCouponBO.getCount();
        jinshiparkCoupon.setRemaincount(newRemaincount);
        jinshiparkCoupon.setCount(newCount);
        jinshiparkCouponMapper.updateByPrimaryKey(jinshiparkCoupon);
    }
}
