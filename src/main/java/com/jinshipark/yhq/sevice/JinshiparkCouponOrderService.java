package com.jinshipark.yhq.sevice;

import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.utils.PagedGridResult;

import java.text.ParseException;

public interface JinshiparkCouponOrderService {
    PagedGridResult searchCouponOrder(SearchVO searchVO) throws ParseException;

    String insertCouponOrder(Integer id, String plate, Integer type) throws Exception;
}
