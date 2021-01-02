package com.jinshipark.yhq.controller;

import com.jinshipark.yhq.model.bo.JinshiparkCouponBO;
import com.jinshipark.yhq.sevice.JinshiparkCouponService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

/**
 * 优惠券生成管理控制页
 */
@Controller
@RequestMapping("/shopCouponManager")
public class JinshiparkCouponController {

    @Autowired
    private JinshiparkCouponService jinshiparkCouponService;

    @CrossOrigin
    @RequestMapping(value = "/saveShopCoupon", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult list(@RequestBody JSONObject jsonParam) {
        return JinshiparkJSONResult.ok();
    }

    /**
     * 查询优惠券生成列表
     *
     * @param jinshiparkCouponBO 优惠券生成实体类
     * @return 处理结果
     */
    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult list(@RequestBody JinshiparkCouponBO jinshiparkCouponBO) {
        return jinshiparkCouponService.list(jinshiparkCouponBO);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult save(@RequestBody JinshiparkCouponBO jinshiparkCouponBO) throws ParseException {
        return jinshiparkCouponService.save(jinshiparkCouponBO);
    }

    @RequestMapping(value = "/selectParkCouponById",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public JinshiparkJSONResult selectParkCouponById(@RequestBody JinshiparkCouponBO jinshiparkCouponBO) {
        return JinshiparkJSONResult.ok(jinshiparkCouponService.selectParkCouponById(jinshiparkCouponBO));
    }
}
