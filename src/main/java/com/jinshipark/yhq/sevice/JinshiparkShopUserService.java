package com.jinshipark.yhq.sevice;


import com.jinshipark.yhq.model.bo.JinshiparkShopUserBO;
import com.jinshipark.yhq.utils.JinshiparkJSONResult;

public interface JinshiparkShopUserService {
    
    JinshiparkJSONResult login(String loginName, String password);

    JinshiparkJSONResult updatePassword(JinshiparkShopUserBO jinshiparkShopUserBO);
}
