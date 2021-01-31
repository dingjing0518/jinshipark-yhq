package com.jinshipark.yhq.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class JinshiparkShopcoupon implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "优惠券名称")
    private String couponname;

    @ApiModelProperty(value = "优惠券类型 0全免券  1减免时长 2减免金额 3当天全免券")
    private String coupontype;

    @ApiModelProperty(value = "优惠券总数量")
    private Integer count;

    @ApiModelProperty(value = "优惠券剩余数量")
    private Integer remaincount;

    @ApiModelProperty(value = "商户id")
    private String shopid;

    @ApiModelProperty(value = "代理商id")
    private String agentid;

    @ApiModelProperty(value = "车场id")
    private String parkid;

    @ApiModelProperty(value = "区域名称")
    private String areaname;

    @ApiModelProperty(value = "区域id")
    private String areaid;

    @ApiModelProperty(value = "优惠券开始时间")
    private Date starttime;

    @ApiModelProperty(value = "优惠券结束时间")
    private Date endtime;

    @ApiModelProperty(value = "优惠券创建时间")
    private Date createtime;

    @ApiModelProperty(value = "备注")
    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getRemaincount() {
        return remaincount;
    }

    public void setRemaincount(Integer remaincount) {
        this.remaincount = remaincount;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        sb.append(", couponname=").append(couponname);
        sb.append(", coupontype=").append(coupontype);
        sb.append(", count=").append(count);
        sb.append(", remaincount=").append(remaincount);
        sb.append(", shopid=").append(shopid);
        sb.append(", agentid=").append(agentid);
        sb.append(", parkid=").append(parkid);
        sb.append(", areaname=").append(areaname);
        sb.append(", areaid=").append(areaid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", createtime=").append(createtime);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}