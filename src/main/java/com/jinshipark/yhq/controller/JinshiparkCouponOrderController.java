package com.jinshipark.yhq.controller;

import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.sevice.JinshiparkCouponOrderService;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

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

    /**
     * 静态优惠券使用接口
     *
     * @param id    优惠券id
     * @param plate 车牌号
     * @param type  优惠券类型
     * @return 处理结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "/insertCouponOrder", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public String insertCouponOrder(@RequestParam("id") Integer id,
                                    @RequestParam("plate") String plate,
                                    @RequestParam("type") Integer type,
                                    @RequestParam("orderId") String orderId,
                                    @RequestParam("num") Integer num) throws Exception {
        return jinshiparkCouponOrderService.insertCouponOrder(id, plate, type, orderId, num);
    }

    /**
     * 动态优惠券使用接口
     *
     * @param id    优惠券id
     * @param plate 车牌号
     * @param type  优惠券类型
     * @return 处理结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "/insertCouponOrderToD", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public String insertCouponOrderToD(@RequestParam("id") Integer id,
                                       @RequestParam("plate") String plate,
                                       @RequestParam("type") Integer type) throws Exception {
        return jinshiparkCouponOrderService.insertCouponOrderToD(id, plate, type);
    }
}
