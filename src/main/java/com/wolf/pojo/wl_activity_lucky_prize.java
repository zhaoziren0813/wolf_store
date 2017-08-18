package com.wolf.pojo;

import java.util.Date;

public class wl_activity_lucky_prize {
    private String id;

    private String luckyid;

    private String prizegradename;

    private String prizename;

    private String couponid;

    private Integer probability;

    private Integer prizenum;

    private Integer prizegetnum;

    private Date createtime;

    private String createuserid;

    private Date updatetime;

    private String updateuserid;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLuckyid() {
        return luckyid;
    }

    public void setLuckyid(String luckyid) {
        this.luckyid = luckyid == null ? null : luckyid.trim();
    }

    public String getPrizegradename() {
        return prizegradename;
    }

    public void setPrizegradename(String prizegradename) {
        this.prizegradename = prizegradename == null ? null : prizegradename.trim();
    }

    public String getPrizename() {
        return prizename;
    }

    public void setPrizename(String prizename) {
        this.prizename = prizename == null ? null : prizename.trim();
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid == null ? null : couponid.trim();
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Integer getPrizenum() {
        return prizenum;
    }

    public void setPrizenum(Integer prizenum) {
        this.prizenum = prizenum;
    }

    public Integer getPrizegetnum() {
        return prizegetnum;
    }

    public void setPrizegetnum(Integer prizegetnum) {
        this.prizegetnum = prizegetnum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}