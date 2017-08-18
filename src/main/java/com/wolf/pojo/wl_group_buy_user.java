package com.wolf.pojo;

import java.util.Date;

public class wl_group_buy_user {
    private String id;

    private String groupbuyid;

    private String groupid;

    private String userid;

    private Integer buystatus;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupbuyid() {
        return groupbuyid;
    }

    public void setGroupbuyid(String groupbuyid) {
        this.groupbuyid = groupbuyid == null ? null : groupbuyid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getBuystatus() {
        return buystatus;
    }

    public void setBuystatus(Integer buystatus) {
        this.buystatus = buystatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}