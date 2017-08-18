package com.wolf.pojo;

import java.util.Date;

public class wl_article {
    private String id;

    private String title;

    private Integer readingquantity;

    private Integer likequantity;

    private Integer collectionquantity;

    private Integer sharequantity;

    private String status;

    private String createuserid;

    private Date createdatetime;

    private String updateuserid;

    private Date updatedatetime;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getReadingquantity() {
        return readingquantity;
    }

    public void setReadingquantity(Integer readingquantity) {
        this.readingquantity = readingquantity;
    }

    public Integer getLikequantity() {
        return likequantity;
    }

    public void setLikequantity(Integer likequantity) {
        this.likequantity = likequantity;
    }

    public Integer getCollectionquantity() {
        return collectionquantity;
    }

    public void setCollectionquantity(Integer collectionquantity) {
        this.collectionquantity = collectionquantity;
    }

    public Integer getSharequantity() {
        return sharequantity;
    }

    public void setSharequantity(Integer sharequantity) {
        this.sharequantity = sharequantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}