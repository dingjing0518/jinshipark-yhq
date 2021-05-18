package com.jinshipark.yhq.model.bo;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JinshiparkCouponBO {

    private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Integer id;

    private String shopid;

    private String parkid;

    private String agentid;

    private String couponname;

    private Integer count;

    private String startdata;

    private String enddata;

    private Integer type;

    private Integer coupontype;

    private String starttime;

    private String endtime;

    private String areaid;

    private String couponId;

    private Integer reductiontime;

    private Integer reductionmoney;

    private String areaname;

    private Date delayEndDate;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStartdata() {
        return startdata;
    }

    public Date getDateForStartdata() throws ParseException {
        return format.parse(this.startdata);
    }

    public void setStartdata(String startdata) {
        this.startdata = startdata;
    }

    public String getEnddata() {
        return enddata;
    }

    public Date getDateForEnddata() throws ParseException {
        return format.parse(this.enddata);
    }

    public void setEnddata(String enddata) {
        this.enddata = enddata;
    }

    public Integer getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(Integer coupontype) {
        this.coupontype = coupontype;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public Integer getReductiontime() {
        return reductiontime;
    }

    public void setReductiontime(Integer reductiontime) {
        this.reductiontime = reductiontime;
    }

    public Integer getReductionmoney() {
        return reductionmoney;
    }

    public void setReductionmoney(Integer reductionmoney) {
        this.reductionmoney = reductionmoney;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDelayEndDate() {
        return delayEndDate;
    }

    public void setDelayEndDate(Date delayEndDate) {
        this.delayEndDate = delayEndDate;
    }
}
