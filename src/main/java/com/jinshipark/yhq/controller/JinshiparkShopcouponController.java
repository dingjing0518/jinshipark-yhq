package com.jinshipark.yhq.controller;

import com.jinshipark.yhq.model.bo.JinshiparkShopcouponBO;
import com.jinshipark.yhq.sevice.JinshiparkShopcouponService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 优惠券管理控制类
 */
@Controller
@RequestMapping("/shopCouponManager")
public class JinshiparkShopcouponController {

    @Autowired
    private JinshiparkShopcouponService jinshiParkCouponManagerService;

    /**
     * @param shopId    用户Id
     * @param parkingId 停车场Id
     * @return 处理结果
     */
    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JinshiparkJSONResult list(@RequestParam("shopId") String shopId,
                                     @RequestParam("parkingId") String parkingId) {

        return jinshiParkCouponManagerService.list(shopId, parkingId);
    }

    /**
     *
     * 根据Id获取优惠券
     */
    @CrossOrigin
    @RequestMapping(value = "/getJinshiparkShopcouponById", method = RequestMethod.POST)
    @ResponseBody
    public JinshiparkJSONResult getJinshiparkShopcouponById(@RequestBody JinshiparkShopcouponBO jinshiparkShopcouponBO) {

        return jinshiParkCouponManagerService.getJinshiparkShopcouponById(jinshiparkShopcouponBO);
    }

}
