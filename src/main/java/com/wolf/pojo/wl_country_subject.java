package com.wolf.pojo;

import java.util.Date;

public class wl_country_subject {
    private String id;

    private String countryshopid;

    private String subjectimage;

    private String homepageimage;

    private String topimage;

    private String littleimage;

    private String title;

    private String maincommodityid;

    private Integer subjectindex;

    private String createuserid;

    private Date createdatetime;

    private String updateuserid;

    private Date updatedatetime;

    private Boolean disabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCountryshopid() {
        return countryshopid;
    }

    public void setCountryshopid(String countryshopid) {
        this.countryshopid = countryshopid == null ? null : countryshopid.trim();
    }

    public String getSubjectimage() {
        return subjectimage;
    }

    public void setSubjectimage(String subjectimage) {
        this.subjectimage = subjectimage == null ? null : subjectimage.trim();
    }

    public String getHomepageimage() {
        return homepageimage;
    }

    public void setHomepageimage(String homepageimage) {
        this.homepageimage = homepageimage == null ? null : homepageimage.trim();
    }

    public String getTopimage() {
        return topimage;
    }

    public void setTopimage(String topimage) {
        this.topimage = topimage == null ? null : topimage.trim();
    }

    public String getLittleimage() {
        return littleimage;
    }

    public void setLittleimage(String littleimage) {
        this.littleimage = littleimage == null ? null : littleimage.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMaincommodityid() {
        return maincommodityid;
    }

    public void setMaincommodityid(String maincommodityid) {
        this.maincommodityid = maincommodityid == null ? null : maincommodityid.trim();
    }

    public Integer getSubjectindex() {
        return subjectindex;
    }

    public void setSubjectindex(Integer subjectindex) {
        this.subjectindex = subjectindex;
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

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}