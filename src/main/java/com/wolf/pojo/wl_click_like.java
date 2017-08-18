package com.wolf.pojo;

import com.wolf.pojo.wl_click_likeKey;

import java.util.Date;

public class wl_click_like extends wl_click_likeKey {
    private Date datetime;

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}