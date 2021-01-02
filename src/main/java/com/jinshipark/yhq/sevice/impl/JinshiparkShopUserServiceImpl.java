package com.jinshipark.yhq.sevice.impl;

import com.jinshipark.yhq.mapper.JinshiparkShopUserMapper;
import com.jinshipark.yhq.model.JinshiparkShopUser;
import com.jinshipark.yhq.model.JinshiparkShopUserExample;
import com.jinshipark.yhq.model.bo.JinshiparkShopUserBO;
import com.jinshipark.yhq.sevice.JinshiparkShopUserService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JinshiparkShopUserServiceImpl implements JinshiparkShopUserService {

    @Autowired
    private JinshiparkShopUserMapper jinshiparkShopUserMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public JinshiparkJSONResult login(String loginName, String password) {
        if (StringUtils.isBlank(loginName) || StringUtils.isBlank(password)) {
            return JinshiparkJSONResult.errorMsg("用户名或者密码不能为空");
        }
        JinshiparkShopUserExample example = new JinshiparkShopUserExample();
        JinshiparkShopUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginnameEqualTo(loginName);
        long count = jinshiparkShopUserMapper.countByExample(example);
        if (count < 1) {
            return JinshiparkJSONResult.errorMsg("用户名不存在");
        }
        criteria.andPasswordEqualTo(password);
        List<JinshiparkShopUser> list = jinshiparkShopUserMapper.selectByExample(example);
        if (null == list || list.size() == 0) {
            return JinshiparkJSONResult.errorMsg("密码错误");
        }
        return JinshiparkJSONResult.ok(list.get(0));
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
