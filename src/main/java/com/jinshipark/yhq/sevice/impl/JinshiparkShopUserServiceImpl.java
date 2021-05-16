package com.jinshipark.yhq.sevice.impl;

import com.jinshipark.yhq.mapper.JinshiparkShopUserMapper;
import com.jinshipark.yhq.mapper2.JinshiparkApakeyMapper;
import com.jinshipark.yhq.model.JinshiparkApakey;
import com.jinshipark.yhq.model.JinshiparkApakeyExample;
import com.jinshipark.yhq.model.JinshiparkShopUser;
import com.jinshipark.yhq.model.JinshiparkShopUserExample;
import com.jinshipark.yhq.model.bo.JinshiparkShopUserBO;
import com.jinshipark.yhq.model.vo.JinshiparkShopUserVO;
import com.jinshipark.yhq.sevice.JinshiparkShopUserService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JinshiparkShopUserServiceImpl implements JinshiparkShopUserService {

    @Autowired
    private JinshiparkShopUserMapper jinshiparkShopUserMapper;

    @Autowired
    private JinshiparkApakeyMapper jinshiparkApakeyMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult login(JinshiparkShopUserBO jinshiparkShopUserBO) {
        if (StringUtils.isBlank(jinshiparkShopUserBO.getParkName())) {
            return JinshiparkJSONResult.errorMsg("车场名称不能为空");
        }
        if (StringUtils.isBlank(jinshiparkShopUserBO.getLoginName()) || StringUtils.isBlank(jinshiparkShopUserBO.getPassword())) {
            return JinshiparkJSONResult.errorMsg("用户名或者密码不能为空");
        }
        //判断车场名称是否存在
        JinshiparkApakeyExample jinshiparkApakeyExample = new JinshiparkApakeyExample();
        JinshiparkApakeyExample.Criteria jinshiparkApakeyExampleCriteria = jinshiparkApakeyExample.createCriteria();
        jinshiparkApakeyExampleCriteria.andParknameEqualTo(jinshiparkShopUserBO.getParkName());
        List<JinshiparkApakey> jinshiparkApakeys = jinshiparkApakeyMapper.selectByExample(jinshiparkApakeyExample);
        if (jinshiparkApakeys.size() == 0) {
            return JinshiparkJSONResult.errorMsg("车场名称不存在");
        }
        JinshiparkApakey jinshiparkApakey = jinshiparkApakeys.get(0);
        //判断用户名是否存在
        JinshiparkShopUserExample example = new JinshiparkShopUserExample();
        JinshiparkShopUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginnameEqualTo(jinshiparkShopUserBO.getLoginName());
        long count = jinshiparkShopUserMapper.countByExample(example);
        if (count < 1) {
            return JinshiparkJSONResult.errorMsg("用户名不存在");
        }


        criteria.andPasswordEqualTo(jinshiparkShopUserBO.getPassword());
        criteria.andParkidEqualTo(jinshiparkApakey.getParkid());
        List<JinshiparkShopUser> list = jinshiparkShopUserMapper.selectByExample(example);
        if (null == list || list.size() == 0) {
            return JinshiparkJSONResult.errorMsg("用户名密码或者车场名称错误");
        }
        JinshiparkShopUserVO jinshiparkShopUserVO = new JinshiparkShopUserVO();
        BeanUtils.copyProperties(list.get(0), jinshiparkShopUserVO);
        return JinshiparkJSONResult.ok(jinshiparkShopUserVO);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public JinshiparkJSONResult updatePassword(JinshiparkShopUserBO jinshiparkShopUserBO) {
        JinshiparkShopUser record = new JinshiparkShopUser();
        record.setId(jinshiparkShopUserBO.getId());
        record.setPassword(jinshiparkShopUserBO.getPassword());
        int result = jinshiparkShopUserMapper.updateByPrimaryKeySelective(record);
        if (result > 0) {
            return JinshiparkJSONResult.ok();
        }
        return JinshiparkJSONResult.errorMsg("修改密码失败");
    }
}
