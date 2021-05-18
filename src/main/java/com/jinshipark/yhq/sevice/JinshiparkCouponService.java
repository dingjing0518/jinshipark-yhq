package com.jinshipark.yhq.sevice;

import com.jinshipark.yhq.model.bo.JinshiparkCouponBO;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;

import java.text.ParseException;

public interface JinshiparkCouponService {

    JinshiparkJSONResult list(JinshiparkCouponBO jinshiparkCouponBO);

    JinshiparkJSONResult save(JinshiparkCouponBO jinshiparkCouponBO) throws ParseException;

    JinshiparkJSONResult selectParkCouponById(JinshiparkCouponBO jinshiparkCouponBO);

    JinshiparkJSONResult updateCoupon(JinshiparkCouponBO jinshiparkCouponBO);

    JinshiparkJSONResult returnBack(JinshiparkCouponBO jinshiparkCouponBO);

    JinshiparkJSONResult deleteByPrimaryKey(JinshiparkCouponBO jinshiparkCouponBO);

    JinshiparkJSONResult delay(JinshiparkCouponBO jinshiparkCouponBO);
}
