package com.jinshipark.yhq.utils;

import net.sf.jxls.transformer.Configuration;
import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Map;

public class DownLoadUtils {
    public static void exportExcel(HttpServletResponse response,
                                   InputStream resourceAsStream,
                                   String downLoadName,
                                   Map<String, Object> beans) {
        try {
            Configuration config = new Configuration();
            XLSTransformer transformer = new XLSTransformer(config);
            Workbook workbook = transformer.transformXLS(resourceAsStream, beans);
            //响应类型为application/octet- stream情况下使用了这个头信息的话，那就意味着不想直接显示内容
            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);

            //attachment为以附件方式下载
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(
                    downLoadName + ".xls",
                    "utf-8"));
            /**
             * 代码里面使用Content-Disposition来确保浏览器弹出下载对话框的时候。
             * response.addHeader("Content-Disposition","attachment");一定要确保没有做过关于禁止浏览器缓存的操作
             */
            response.setHeader("Cache-Control", "No-cache");
            response.flushBuffer();
            workbook.write(response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
