package com.wolf.pojo;

import java.util.Date;

public class wl_user_coupon {
    private String id;

    private String userid;

    private String couponid;

    private Integer couponmoney;

    private Date starttime;

    private Date expiretime;

    private String description;

    private Date createtime;

    private String createbycode;

    private Date updatetime;

    private String updatebycode;

    private String status;

    private String describe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid == null ? null : couponid.trim();
    }

    public Integer getCouponmoney() {
        return couponmoney;
    }

    public void setCouponmoney(Integer couponmoney) {
        this.couponmoney = couponmoney;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatebycode() {
        return createbycode;
    }

    public void setCreatebycode(String createbycode) {
        this.createbycode = createbycode == null ? null : createbycode.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatebycode() {
        return updatebycode;
    }

    public void setUpdatebycode(String updatebycode) {
        this.updatebycode = updatebycode == null ? null : updatebycode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}