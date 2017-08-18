package com.wolf.pojo;

import java.util.Date;

public class wl_group_buy_group {
    private String id;

    private String groupbuyid;

    private String groupbuytoken;

    private String groupuserid;

    private Integer groupbuystatus;

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

    public String getGroupbuytoken() {
        return groupbuytoken;
    }

    public void setGroupbuytoken(String groupbuytoken) {
        this.groupbuytoken = groupbuytoken == null ? null : groupbuytoken.trim();
    }

    public String getGroupuserid() {
        return groupuserid;
    }

    public void setGroupuserid(String groupuserid) {
        this.groupuserid = groupuserid == null ? null : groupuserid.trim();
    }

    public Integer getGroupbuystatus() {
        return groupbuystatus;
    }

    public void setGroupbuystatus(Integer groupbuystatus) {
        this.groupbuystatus = groupbuystatus;
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