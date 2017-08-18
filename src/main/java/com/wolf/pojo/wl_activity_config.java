package com.wolf.pojo;

import java.util.Date;

public class wl_activity_config {
    private String id;

    private String activityname;

    private String activityurl;

    private String activitysql;

    private String createuserid;

    private Date createtime;

    private String updateuserid;

    private Date updatetime;

    private Integer status;

    private String remark;

    private Date activityexpiredtime;

    private Integer activitytype;

    private String activityimageurl;

    private String backgroundcolor;

    private Integer adtype;

    private String adsql;

    private String sharetitle;

    private String sharetext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }

    public String getActivityurl() {
        return activityurl;
    }

    public void setActivityurl(String activityurl) {
        this.activityurl = activityurl == null ? null : activityurl.trim();
    }

    public String getActivitysql() {
        return activitysql;
    }

    public void setActivitysql(String activitysql) {
        this.activitysql = activitysql == null ? null : activitysql.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getActivityexpiredtime() {
        return activityexpiredtime;
    }

    public void setActivityexpiredtime(Date activityexpiredtime) {
        this.activityexpiredtime = activityexpiredtime;
    }

    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
    }

    public String getActivityimageurl() {
        return activityimageurl;
    }

    public void setActivityimageurl(String activityimageurl) {
        this.activityimageurl = activityimageurl == null ? null : activityimageurl.trim();
    }

    public String getBackgroundcolor() {
        return backgroundcolor;
    }

    public void setBackgroundcolor(String backgroundcolor) {
        this.backgroundcolor = backgroundcolor == null ? null : backgroundcolor.trim();
    }

    public Integer getAdtype() {
        return adtype;
    }

    public void setAdtype(Integer adtype) {
        this.adtype = adtype;
    }

    public String getAdsql() {
        return adsql;
    }

    public void setAdsql(String adsql) {
        this.adsql = adsql == null ? null : adsql.trim();
    }

    public String getSharetitle() {
        return sharetitle;
    }

    public void setSharetitle(String sharetitle) {
        this.sharetitle = sharetitle == null ? null : sharetitle.trim();
    }

    public String getSharetext() {
        return sharetext;
    }

    public void setSharetext(String sharetext) {
        this.sharetext = sharetext == null ? null : sharetext.trim();
    }
}