package com.jinshipark.yhq.sevice.impl;

import com.jinshipark.yhq.model.vo.JinshiparkCouponOrderVO;
import com.jinshipark.yhq.sevice.FileExportService;
import com.jinshipark.yhq.utils.DateUtil;
import com.jinshipark.yhq.utils.DownLoadUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FileExportServiceImpl implements FileExportService {

    @Override
    public void exportCouponOrderList(List<JinshiparkCouponOrderVO> jinshiparkCouponOrderVOS, HttpServletResponse response) {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("excel" + File.separator + "orderList.xls");
        String downLoadName = "order" + DateUtil.formatYearMonthDayHMS(new Date());
        Map<String, Object> beans = new HashMap<>();
        beans.put("dto", jinshiparkCouponOrderVOS);
        DownLoadUtils.exportExcel(response, resourceAsStream, downLoadName, beans);
    }
}
