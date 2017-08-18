package com.wolf.pojo;

public class wl_homefloor_style_pc {
    private String id;

    private String categoryid;

    private String commodityids;

    private Integer homefloorstylesort;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getCommodityids() {
        return commodityids;
    }

    public void setCommodityids(String commodityids) {
        this.commodityids = commodityids == null ? null : commodityids.trim();
    }

    public Integer getHomefloorstylesort() {
        return homefloorstylesort;
    }

    public void setHomefloorstylesort(Integer homefloorstylesort) {
        this.homefloorstylesort = homefloorstylesort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}