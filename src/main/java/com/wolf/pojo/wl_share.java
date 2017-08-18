package com.wolf.pojo;

import com.wolf.pojo.wl_shareKey;

import java.util.Date;

public class wl_share extends wl_shareKey {
    private Integer sharequantity;

    private Date datetime;

    public Integer getSharequantity() {
        return sharequantity;
    }

    public void setSharequantity(Integer sharequantity) {
        this.sharequantity = sharequantity;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}