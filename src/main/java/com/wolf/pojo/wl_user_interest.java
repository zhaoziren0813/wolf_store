package com.wolf.pojo;

import java.util.Date;

public class wl_user_interest {
    private String id;

    private String userid;

    private Integer sex;

    private String permanentplace;

    private String birthdate;

    private Integer skintype;

    private String interest;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPermanentplace() {
        return permanentplace;
    }

    public void setPermanentplace(String permanentplace) {
        this.permanentplace = permanentplace == null ? null : permanentplace.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public Integer getSkintype() {
        return skintype;
    }

    public void setSkintype(Integer skintype) {
        this.skintype = skintype;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest == null ? null : interest.trim();
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
}