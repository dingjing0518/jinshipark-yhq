package com.jinshipark.yhq.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class JinshiparkCouponOrderHistory implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "车牌号")
    private String plate;

    @ApiModelProperty(value = "订单类型 0-未使用  1-已使用 2-手动删除")
    private String state;

    @ApiModelProperty(value = "订单号")
    private String orderid;

    @ApiModelProperty(value = "停车时长")
    private String parktime;

    @ApiModelProperty(value = "进场时间")
    private Date intime;

    @ApiModelProperty(value = "出场时间")
    private Date outtime;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "代理商id")
    private String agentid;

    @ApiModelProperty(value = "车场id")
    private String parkid;

    @ApiModelProperty(value = "区域id")
    private String areaid;

    @ApiModelProperty(value = "优惠券id")
    private String couponid;

    @ApiModelProperty(value = "优惠券生成id")
    private Integer jcoCouponGenerateId;

    @ApiModelProperty(value = "优惠券所属商户id")
    private String shopid;

    @ApiModelProperty(value = "优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券")
    private String type;

    @ApiModelProperty(value = "减免时长")
    private String reductiontime;

    @ApiModelProperty(value = "减免金额")
    private String reductionmoney;

    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "订单允许扫码次数")
    private Integer num;

    @ApiModelProperty(value = "备注")
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