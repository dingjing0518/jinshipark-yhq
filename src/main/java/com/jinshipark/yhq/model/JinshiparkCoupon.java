package com.jinshipark.yhq.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class JinshiparkCoupon implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "优惠券id")
    private String couponid;

    @ApiModelProperty(value = "优惠券名称")
    private String name;

    @ApiModelProperty(value = "优惠券类型（0：全免券 只要判断区域就可以，1：减免时长 就是停车时长减去减免时长 剩余时长计算费用，2：减免金额 根据计算出来费用 就是不管多少钱 减去减免时长，3：当天有效全免券")
    private Integer type;

    @ApiModelProperty(value = "优惠券总张数")
    private Integer count;

    @ApiModelProperty(value = "优惠券剩余数量")
    private String remaincount;

    @ApiModelProperty(value = "开始时间")
    private Date startdate;

    @ApiModelProperty(value = "结束时间")
    private Date enddate;

    @ApiModelProperty(value = "每天几点开始")
    private String starttime;

    @ApiModelProperty(value = "每天几点结束")
    private String endtime;

    @ApiModelProperty(value = "每张优惠券减免时长(单位为分钟)Type=1")
    private Integer reductiontime;

    @ApiModelProperty(value = "每张优惠券减免金额(单元为元)Type=2")
    private Integer reductionmoney;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "商户id")
    private String shopid;

    @ApiModelProperty(value = "区域名称")
    private String areaname;

    @ApiModelProperty(value = "区域id")
    private String areaid;

    @ApiModelProperty(value = "车场id")
    private String parkid;

    @ApiModelProperty(value = "代理商id")
    private String agentid;

    @ApiModelProperty(value = "备注")
    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemaincount() {
        return remaincount;
    }

    public void setRemaincount(String remaincount) {
        this.remaincount = remaincount;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
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
        sb.append(", couponid=").append(couponid);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", count=").append(count);
        sb.append(", remaincount=").append(remaincount);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", reductiontime=").append(reductiontime);
        sb.append(", reductionmoney=").append(reductionmoney);
        sb.append(", createtime=").append(createtime);
        sb.append(", shopid=").append(shopid);
        sb.append(", areaname=").append(areaname);
        sb.append(", areaid=").append(areaid);
        sb.append(", parkid=").append(parkid);
        sb.append(", agentid=").append(agentid);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}