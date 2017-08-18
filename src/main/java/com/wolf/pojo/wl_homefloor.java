package com.wolf.pojo;

import java.util.Date;

public class wl_homefloor {
    private String id;

    private String homefloorstyleid;

    private String name;

    private String image;

    private String imagedetail;

    private String url;

    private Integer homefloorsort;

    private String createuserid;

    private Date createtime;

    private String updateuserid;

    private Date updatetime;

    private Integer status;

    private Integer ctype;

    private String commodityids;

    private String commoditysql;

    private Integer detailtype;

    private String sharetitle;

    private String sharetext;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHomefloorstyleid() {
        return homefloorstyleid;
    }

    public void setHomefloorstyleid(String homefloorstyleid) {
        this.homefloorstyleid = homefloorstyleid == null ? null : homefloorstyleid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getImagedetail() {
        return imagedetail;
    }

    public void setImagedetail(String imagedetail) {
        this.imagedetail = imagedetail == null ? null : imagedetail.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getHomefloorsort() {
        return homefloorsort;
    }

    public void setHomefloorsort(Integer homefloorsort) {
        this.homefloorsort = homefloorsort;
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

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getCommodityids() {
        return commodityids;
    }

    public void setCommodityids(String commodityids) {
        this.commodityids = commodityids == null ? null : commodityids.trim();
    }

    public String getCommoditysql() {
        return commoditysql;
    }

    public void setCommoditysql(String commoditysql) {
        this.commoditysql = commoditysql == null ? null : commoditysql.trim();
    }

    public Integer getDetailtype() {
        return detailtype;
    }

    public void setDetailtype(Integer detailtype) {
        this.detailtype = detailtype;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}