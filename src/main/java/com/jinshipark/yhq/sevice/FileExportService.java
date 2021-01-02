package com.jinshipark.yhq.sevice;

import com.jinshipark.yhq.model.vo.JinshiparkCouponOrderVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface FileExportService {
    void exportCouponOrderList(List<JinshiparkCouponOrderVO> jinshiparkCouponOrderVOS, HttpServletResponse response);
}
