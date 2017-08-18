package com.wolf.pojo;

import java.util.Date;

public class wl_activity_recommend {
    private String id;

    private String recommenduserid;

    private String recommendcode;

    private String phone;

    private Date createtime;

    private Date agreetime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecommenduserid() {
        return recommenduserid;
    }

    public void setRecommenduserid(String recommenduserid) {
        this.recommenduserid = recommenduserid == null ? null : recommenduserid.trim();
    }

    public String getRecommendcode() {
        return recommendcode;
    }

    public void setRecommendcode(String recommendcode) {
        this.recommendcode = recommendcode == null ? null : recommendcode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getAgreetime() {
        return agreetime;
    }

    public void setAgreetime(Date agreetime) {
        this.agreetime = agreetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}