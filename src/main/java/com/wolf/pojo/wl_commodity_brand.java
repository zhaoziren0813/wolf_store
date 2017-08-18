package com.wolf.pojo;

import java.util.Date;

public class wl_commodity_brand {
    private String id;

    private String chnbrand;

    private String engbrand;

    private String imageurl;

    private String createbycode;

    private Date createtime;

    private String updatebycode;

    private Date updatetime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChnbrand() {
        return chnbrand;
    }

    public void setChnbrand(String chnbrand) {
        this.chnbrand = chnbrand == null ? null : chnbrand.trim();
    }

    public String getEngbrand() {
        return engbrand;
    }

    public void setEngbrand(String engbrand) {
        this.engbrand = engbrand == null ? null : engbrand.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getCreatebycode() {
        return createbycode;
    }

    public void setCreatebycode(String createbycode) {
        this.createbycode = createbycode == null ? null : createbycode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdatebycode() {
        return updatebycode;
    }

    public void setUpdatebycode(String updatebycode) {
        this.updatebycode = updatebycode == null ? null : updatebycode.trim();
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
}