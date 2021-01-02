package com.jinshipark.yhq.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class JinshiparkCouponOrderHistoryVO implements Serializable {
    private Integer id;


    private String plate;


    private String state;


    private String orderid;


    private String parktime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date intime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date outtime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;


    private String agentid;


    private String parkid;


    private String areaid;


    private String couponid;

    private Integer jcoCouponGenerateId;


    private String shopid;


    private String type;


    private String reductiontime;


    private String reductionmoney;


    private String sign;


    private Integer num;


    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getParktime() {
        return parktime;
    }

    public void setParktime(String parktime) {
        this.parktime = parktime;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    public Integer getJcoCouponGenerateId() {
        return jcoCouponGenerateId;
    }

    public void setJcoCouponGenerateId(Integer jcoCouponGenerateId) {
        this.jcoCouponGenerateId = jcoCouponGenerateId;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReductiontime() {
        return reductiontime;
    }

    public void setReductiontime(String reductiontime) {
        this.reductiontime = reductiontime;
    }

    public String getReductionmoney() {
        return reductionmoney;
    }

    public void setReductionmoney(String reductionmoney) {
        this.reductionmoney = reductionmoney;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", plate=").append(plate);
        sb.append(", state=").append(state);
        sb.append(", orderid=").append(orderid);
        sb.append(", parktime=").append(parktime);
        sb.append(", intime=").append(intime);
        sb.append(", outtime=").append(outtime);
        sb.append(", createtime=").append(createtime);
        sb.append(", agentid=").append(agentid);
        sb.append(", parkid=").append(parkid);
        sb.append(", areaid=").append(areaid);
        sb.append(", couponid=").append(couponid);
        sb.append(", jcoCouponGenerateId=").append(jcoCouponGenerateId);
        sb.append(", shopid=").append(shopid);
        sb.append(", type=").append(type);
        sb.append(", reductiontime=").append(reductiontime);
        sb.append(", reductionmoney=").append(reductionmoney);
        sb.append(", sign=").append(sign);
        sb.append(", num=").append(num);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}