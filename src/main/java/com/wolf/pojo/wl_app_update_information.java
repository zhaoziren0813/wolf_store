package com.wolf.pojo;

import java.util.Date;

public class wl_app_update_information {
    private String id;

    private String appname;

    private String url;

    private Integer version;

    private Integer isupdate;

    private Integer preupdateversion;

    private String versionupdatedescribes;

    private String createuserid;

    private Date createdatetime;

    private String updateuserid;

    private Date updatedatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(Integer isupdate) {
        this.isupdate = isupdate;
    }

    public Integer getPreupdateversion() {
        return preupdateversion;
    }

    public void setPreupdateversion(Integer preupdateversion) {
        this.preupdateversion = preupdateversion;
    }

    public String getVersionupdatedescribes() {
        return versionupdatedescribes;
    }

    public void setVersionupdatedescribes(String versionupdatedescribes) {
        this.versionupdatedescribes = versionupdatedescribes == null ? null : versionupdatedescribes.trim();
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
}