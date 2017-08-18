package com.wolf.pojo;

import java.util.Date;

public class wl_seller {
    private String id;

    private String sellername;

    private String status;

    private String createbycode;

    private Date createtime;

    private String updatebycode;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}