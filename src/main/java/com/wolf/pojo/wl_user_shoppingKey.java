package com.wolf.pojo;

public class wl_user_shoppingKey {
    private String userid;

    private String commodityid;

    private String inventoryid;

    private Integer groupbuystatus;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid == null ? null : inventoryid.trim();
    }

    public Integer getGroupbuystatus() {
        return groupbuystatus;
    }

    public void setGroupbuystatus(Integer groupbuystatus) {
        this.groupbuystatus = groupbuystatus;
    }
}