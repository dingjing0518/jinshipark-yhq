package com.jinshipark.yhq.controller;


import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.sevice.JinshiparkCouponOrderHistoryService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

/**
 * 优惠券订单历史控制类
 */
@Controller
@RequestMapping("/couponOrderHistoryManager")
public class JinshiparkCouponOrderHistoryController {
    @Autowired
    private JinshiparkCouponOrderHistoryService jinshiparkCouponOrderHistoryService;

    @CrossOrigin
    @RequestMapping(value = "/searchCouponOrderHistory", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult searchCouponOrderHistory(@RequestBody SearchVO searchVO) throws ParseException {
        return JinshiparkJSONResult.ok(jinshiparkCouponOrderHistoryService.searchCouponOrderHistory(searchVO));
    }
}
