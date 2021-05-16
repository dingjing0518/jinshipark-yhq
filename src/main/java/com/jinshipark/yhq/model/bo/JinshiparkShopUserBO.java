package com.jinshipark.yhq.model.bo;

/**
 * 优惠券用户前端传过来的封装实体
 */
public class JinshiparkShopUserBO {

    private Integer id;

    private String loginName;

    private String password;

    private String parkName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    @Override
    public String toString() {
        return "JinshiparkShopUserBO{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", parkName='" + parkName + '\'' +
                '}';
    }
}