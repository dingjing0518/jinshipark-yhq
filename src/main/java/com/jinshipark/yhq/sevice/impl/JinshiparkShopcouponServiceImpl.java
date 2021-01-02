package com.jinshipark.yhq.sevice.impl;

import com.jinshipark.yhq.mapper.JinshiparkShopUserMapper;
import com.jinshipark.yhq.mapper.JinshiparkShopcouponMapper;
import com.jinshipark.yhq.model.*;
import com.jinshipark.yhq.model.vo.JinshiparkShopcouponVO;
import com.jinshipark.yhq.sevice.JinshiparkShopcouponService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class JinshiparkShopcouponServiceImpl implements JinshiparkShopcouponService {
    @Autowired
    private JinshiparkShopcouponMapper jinshiparkShopcouponMapper;

    @Autowired
    private JinshiparkShopUserMapper jinshiparkShopUserMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult list(String shopId, String parkingId) {
        List<JinshiparkShopcouponVO> list = new ArrayList<>();
        JinshiparkShopcouponExample example = new JinshiparkShopcouponExample();
        JinshiparkShopcouponExample.Criteria criteria = example.createCriteria();
        criteria.andShopidEqualTo(shopId);
        criteria.andParkidEqualTo(parkingId);
        List<JinshiparkShopcoupon> result = jinshiparkShopcouponMapper.selectByExample(example);
        for (JinshiparkShopcoupon jinshiparkShopcoupon : result) {
            JinshiparkShopcouponVO jinshiparkShopcouponVo = new JinshiparkShopcouponVO();
            jinshiparkShopcouponVo.setId(jinshiparkShopcoupon.getId());//优惠券Id
            jinshiparkShopcouponVo.setCouponname(jinshiparkShopcoupon.getCouponname());//优惠券名称
            jinshiparkShopcouponVo.setCoupontype(jinshiparkShopcoupon.getCoupontype());//优惠券类型
            if (null != jinshiparkShopcoupon.getCount()) {
                jinshiparkShopcouponVo.setCount(jinshiparkShopcoupon.getCount());//总数量
            }
            jinshiparkShopcouponVo.setStarttime(jinshiparkShopcoupon.getStarttime());//开始时间
            jinshiparkShopcouponVo.setEndtime(jinshiparkShopcoupon.getEndtime());//结束时间
            jinshiparkShopcouponVo.setCreatetime(jinshiparkShopcoupon.getCreatetime());//创建时间
            if (jinshiparkShopcoupon.getRemaincount() != null) {
                jinshiparkShopcouponVo.setRemaincount(jinshiparkShopcoupon.getRemaincount());//剩余数量
            }
            JinshiparkShopUserExample jinshiparkShopUserExample = new JinshiparkShopUserExample();
            JinshiparkShopUserExample.Criteria jinshiparkShopUserExampleCriteria = jinshiparkShopUserExample.createCriteria();
            jinshiparkShopUserExampleCriteria.andShopidEqualTo(shopId);
            List<JinshiparkShopUser> jinshiparkShopUserList = jinshiparkShopUserMapper.selectByExample(jinshiparkShopUserExample);
            jinshiparkShopcouponVo.setShopName(jinshiparkShopUserList.get(0).getLoginname());//商户名称
            //todo 根据agentId去代理表中获取代理用户名
            String agentId = jinshiparkShopcoupon.getAgentid();
            jinshiparkShopcouponVo.setAgentid(agentId);
            //todo 根据parkId去停车场表中获取停车场名称
            String parkId = jinshiparkShopcoupon.getParkid();
            jinshiparkShopcouponVo.setParkid(parkId);
            //todo 根据areaId去区域表中获取区域名称
            String areaId = jinshiparkShopcoupon.getAreaid();
            jinshiparkShopcouponVo.setAreaid(areaId);
            jinshiparkShopcouponVo.setShopid(shopId);
            list.add(jinshiparkShopcouponVo);
        }
        return JinshiparkJSONResult.ok(list);
    }
}
