package com.wolf.pojo;

import java.util.Date;

public class wl_sms_marketing_relation {
    private String id;

    private String smsmarketingid;

    private String relationtype;

    private String relationid;

    private String createuserid;

    private Date createdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSmsmarketingid() {
        return smsmarketingid;
    }

    public void setSmsmarketingid(String smsmarketingid) {
        this.smsmarketingid = smsmarketingid == null ? null : smsmarketingid.trim();
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype == null ? null : relationtype.trim();
    }

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid == null ? null : relationid.trim();
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
}