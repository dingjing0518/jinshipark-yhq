package com.jinshipark.yhq.sevice;

import com.jinshipark.yhq.utils.JinshiparkJSONResult;

public interface JinshiparkShopcouponService {
    JinshiparkJSONResult list(String shopId, String parkingId);
}
