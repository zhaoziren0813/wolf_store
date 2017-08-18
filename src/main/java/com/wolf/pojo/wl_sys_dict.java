package com.wolf.pojo;

import java.util.Date;

public class wl_sys_dict {
    private Integer id;

    private String catalogcode;

    private String catalogname;

    private String catalogvalue;

    private String catalogdesc;

    private String keycode;

    private String keyname;

    private String keydesc;

    private Integer parentid;

    private String validflag;

    private Date createdtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatalogcode() {
        return catalogcode;
    }

    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode == null ? null : catalogcode.trim();
    }

    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname == null ? null : catalogname.trim();
    }

    public String getCatalogvalue() {
        return catalogvalue;
    }

    public void setCatalogvalue(String catalogvalue) {
        this.catalogvalue = catalogvalue == null ? null : catalogvalue.trim();
    }

    public String getCatalogdesc() {
        return catalogdesc;
    }

    public void setCatalogdesc(String catalogdesc) {
        this.catalogdesc = catalogdesc == null ? null : catalogdesc.trim();
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode == null ? null : keycode.trim();
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname == null ? null : keyname.trim();
    }

    public String getKeydesc() {
        return keydesc;
    }

    public void setKeydesc(String keydesc) {
        this.keydesc = keydesc == null ? null : keydesc.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getValidflag() {
        return validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag == null ? null : validflag.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}