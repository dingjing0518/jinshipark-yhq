package com.jinshipark.yhq.model.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class JinshiparkShopUserVO {
    private Integer id;

    @ApiModelProperty(value = "登录名称")
    private String loginname;

    @ApiModelProperty(value = "联系人")
    private String password;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "权限")
    private String role;

    @ApiModelProperty(value = "商户标号")
    private String shopid;

    @ApiModelProperty(value = "车场编号")
    private String parkid;

    @ApiModelProperty(value = "代理商编号")
    private String agentid;

    @ApiModelProperty(value = "区域编号")
    private String areaid;

    @ApiModelProperty(value = "创建时间")
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

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
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
        sb.append(", loginname=").append(loginname);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", role=").append(role);
        sb.append(", shopid=").append(shopid);
        sb.append(", parkid=").append(parkid);
        sb.append(", agentid=").append(agentid);
        sb.append(", areaid=").append(areaid);
        sb.append(", createtime=").append(createtime);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
