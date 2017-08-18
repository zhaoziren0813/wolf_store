package com.wolf.pojo;

import java.util.Date;

public class wl_homefloor_style {
    private String id;

    private String subjectid;

    private Integer style;

    private String homefloorstylename;

    private Integer homefloorstylesort;

    private Date begintime;

    private Date endtime;

    private Date createtime;

    private Integer status;

    private String remark;

    private String commodityids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid == null ? null : subjectid.trim();
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public String getHomefloorstylename() {
        return homefloorstylename;
    }

    public void setHomefloorstylename(String homefloorstylename) {
        this.homefloorstylename = homefloorstylename == null ? null : homefloorstylename.trim();
    }

    public Integer getHomefloorstylesort() {
        return homefloorstylesort;
    }

    public void setHomefloorstylesort(Integer homefloorstylesort) {
        this.homefloorstylesort = homefloorstylesort;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCommodityids() {
        return commodityids;
    }

    public void setCommodityids(String commodityids) {
        this.commodityids = commodityids == null ? null : commodityids.trim();
    }
}