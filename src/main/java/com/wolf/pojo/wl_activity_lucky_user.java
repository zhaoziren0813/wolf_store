package com.wolf.pojo;

import java.util.Date;

public class wl_activity_lucky_user {
    private String id;

    private String luckyid;

    private String userid;

    private Integer luckynum;

    private Integer luckygetnum;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getLuckynum() {
        return luckynum;
    }

    public void setLuckynum(Integer luckynum) {
        this.luckynum = luckynum;
    }

    public Integer getLuckygetnum() {
        return luckygetnum;
    }

    public void setLuckygetnum(Integer luckygetnum) {
        this.luckygetnum = luckygetnum;
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