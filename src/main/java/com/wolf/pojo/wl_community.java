package com.wolf.pojo;

import java.util.Date;

public class wl_community {
    private String id;

    private String acturl;

    private String title;

    private String subtitle;

    private String listimg;

    private String categoryid;

    private String sharelinks;

    private Integer communitytype;

    private Integer sort;

    private Date createtime;

    private Date updatetime;

    private Integer examine;

    private Integer status;

    private String createuserid;

    private String updateuserid;

    private String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActurl() {
        return acturl;
    }

    public void setActurl(String acturl) {
        this.acturl = acturl == null ? null : acturl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getListimg() {
        return listimg;
    }

    public void setListimg(String listimg) {
        this.listimg = listimg == null ? null : listimg.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getSharelinks() {
        return sharelinks;
    }

    public void setSharelinks(String sharelinks) {
        this.sharelinks = sharelinks == null ? null : sharelinks.trim();
    }

    public Integer getCommunitytype() {
        return communitytype;
    }

    public void setCommunitytype(Integer communitytype) {
        this.communitytype = communitytype;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public Integer getExamine() {
        return examine;
    }

    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}