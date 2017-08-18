package com.wolf.pojo;

import com.wolf.pojo.wl_commodity;

public class wl_commodityWithBLOBs extends wl_commodity {
    private String detail;

    private String brand;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }
}