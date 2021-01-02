package com.jinshipark.yhq.sevice;

import com.jinshipark.yhq.model.bo.SearchVO;
import com.jinshipark.yhq.utils.PagedGridResult;

import java.text.ParseException;

public interface JinshiparkCouponOrderHistoryService {
    PagedGridResult searchCouponOrderHistory(SearchVO searchVO) throws ParseException;
}
