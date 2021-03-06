package com.jinshipark.yhq.controller;

import com.jinshipark.yhq.model.bo.JinshiparkShopUserBO;
import com.jinshipark.yhq.sevice.JinshiparkShopUserService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 优惠券用户相关操作控制类
 */
@Controller
@RequestMapping("/user")
public class JinshiparkShopUserController {

    @Autowired
    private JinshiparkShopUserService jinshiparkShopUserService;

    /**
     * 登录
     *
     * @return 处理结果
     */
    @CrossOrigin
    @PostMapping(value = "/login")
    @ResponseBody
    public JinshiparkJSONResult login(@RequestBody JinshiparkShopUserBO jinshiparkShopUserBO) {
        return jinshiparkShopUserService.login(jinshiparkShopUserBO);
    }

    /**
     * 修改密码
     *
     * @param jinshiparkShopUserBO 参数实体
     * @return 处理结果
     */
    @CrossOrigin
    @PostMapping(value = "/updatePassword")
    @ResponseBody
    public JinshiparkJSONResult updatePassword(@RequestBody JinshiparkShopUserBO jinshiparkShopUserBO) {
        return jinshiparkShopUserService.updatePassword(jinshiparkShopUserBO);
    }
}
