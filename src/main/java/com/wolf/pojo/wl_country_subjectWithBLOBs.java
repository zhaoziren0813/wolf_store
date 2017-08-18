package com.wolf.pojo;

import com.wolf.pojo.wl_country_subject;

public class wl_country_subjectWithBLOBs extends wl_country_subject {
    private String content;

    private String commodityids;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCommodityids() {
        return commodityids;
    }

    public void setCommodityids(String commodityids) {
        this.commodityids = commodityids == null ? null : commodityids.trim();
    }
}