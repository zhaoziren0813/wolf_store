package com.wolf.pojo;

import java.util.Date;

public class wl_category {
    private String cateid;

    private String catename;

    private String parentid;

    private Integer grade;

    private Date createtime;

    private String categoryicon;

    private String image;

    private String imagepc;

    private String channel;

    private Integer sortitem;

    private String createuserid;

    private Date createdatetime;

    private String updateuserid;

    private Date updatedatetime;

    private String categorycode;

    private Integer earlywarningtime;

    private Boolean recommend;

    public String getCateid() {
        return cateid;
    }

    public void setCateid(String cateid) {
        this.cateid = cateid == null ? null : cateid.trim();
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename == null ? null : catename.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCategoryicon() {
        return categoryicon;
    }

    public void setCategoryicon(String categoryicon) {
        this.categoryicon = categoryicon == null ? null : categoryicon.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getImagepc() {
        return imagepc;
    }

    public void setImagepc(String imagepc) {
        this.imagepc = imagepc == null ? null : imagepc.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Integer getSortitem() {
        return sortitem;
    }

    public void setSortitem(Integer sortitem) {
        this.sortitem = sortitem;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public Date getUpdatedatetime() {
        return updatedatetime;
    }

    public void setUpdatedatetime(Date updatedatetime) {
        this.updatedatetime = updatedatetime;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode == null ? null : categorycode.trim();
    }

    public Integer getEarlywarningtime() {
        return earlywarningtime;
    }

    public void setEarlywarningtime(Integer earlywarningtime) {
        this.earlywarningtime = earlywarningtime;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }
}