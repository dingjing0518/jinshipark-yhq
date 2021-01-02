package com.jinshipark.yhq.controller;

import com.alibaba.fastjson.JSONObject;
import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.sevice.JinshiparkCouponOrderService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 优惠券订单控制类
 */
@Controller
@RequestMapping("/couponOrderManager")
public class JinshiparkCouponOrderController {

    @Autowired
    private JinshiparkCouponOrderService jinshiparkCouponOrderService;

    @CrossOrigin
    @RequestMapping(value = "/searchCouponOrder", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult searchCouponOrder(@RequestBody SearchVO searchVO) throws ParseException {
        return JinshiparkJSONResult.ok(jinshiparkCouponOrderService.searchCouponOrder(searchVO));
    }

    @RequestMapping(value = "/insertCouponOrder", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public String insertCouponOrder(@RequestParam("id") Integer id,
                                    @RequestParam("plate") String plate,
                                    @RequestParam("type") Integer type) throws Exception {
        return jinshiparkCouponOrderService.insertCouponOrder(id, plate, type);
    }
}
