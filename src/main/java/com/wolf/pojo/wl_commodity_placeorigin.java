package com.wolf.pojo;

import java.util.Date;

public class wl_commodity_placeorigin {
    private String id;

    private String chnorigin;

    private String engorigin;

    private Date createtime;

    private Integer status;

    private String placecode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChnorigin() {
        return chnorigin;
    }

    public void setChnorigin(String chnorigin) {
        this.chnorigin = chnorigin == null ? null : chnorigin.trim();
    }

    public String getEngorigin() {
        return engorigin;
    }

    public void setEngorigin(String engorigin) {
        this.engorigin = engorigin == null ? null : engorigin.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode == null ? null : placecode.trim();
    }
}