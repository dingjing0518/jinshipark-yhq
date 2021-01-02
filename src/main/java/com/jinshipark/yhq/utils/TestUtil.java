package com.jinshipark.yhq.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class TestUtil {


    public static String getOrderIdByUUId() {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
//         0 代表前面补充0
//         4 代表长度为4
//         d 代表参数为正数型
        return  machineId+ String.format("%015d", hashCodeV);
    }
    public static String getOrderIdByUUIdAddPlate(String carNumber) {
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String dateName = df.format(calendar.getTime());
        String substring = carNumber.substring(carNumber.length() - 6);
        String s = ChineseUtil.filterChinese(substring);
        if (s.length() < 6) {
            StringBuilder sb = new StringBuilder();
            while (s.length() < 6) {
                sb.append("I");
                sb.append(s);
                s = sb.toString();
            }
        }
        Random ne=new Random();//实例化一个random的对象ne
        int x = ne.nextInt(99999-10000+1)+10000;
        String random_order = String.valueOf(x);
        String order_id = dateName +random_order + s;
        return order_id;
    }

    public static String getOrderIdByUUId(String carNumber,Integer jcgParkingId) {
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String dateName = df.format(calendar.getTime());
        String substring = carNumber.substring(carNumber.length() - 6);
        String s = ChineseUtil.filterChinese(substring);
        String a = "";
        if (s.length() < 6) {
            StringBuilder sb = new StringBuilder();
            while (s.length() < 6) {
                sb.append("I");
                sb.append(s);
                s = sb.toString();
            }
        }

        if (jcgParkingId==1){
            a="00001";
        }
        if (jcgParkingId==3) {
            a = "00003";
        }
        if (jcgParkingId==27){
            a="00004";
        }
        if (jcgParkingId==28){
            a="00005";
        }

        Random ne=new Random();//实例化一个random的对象ne
        int x = ne.nextInt(99999-10000+1)+10000;
        String random_order = String.valueOf(x);
        String order_id = dateName +a + s;
        return order_id;
    }
}
