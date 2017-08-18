package com.wolf.pojo;

import java.util.Date;

public class wl_coupon {
    private String id;

    private String coupontype;

    private String couponname;

    private String couponcode;

    private String categoryid;

    private Integer fullmoney;

    private Integer discountmoney;

    private Integer discount;

    private Integer minmoney;

    private Integer maxmoney;

    private Date starttime;

    private Date expiretime;

    private Date expirestarttime;

    private Integer expiredays;

    private Integer quantity;

    private String imageurl;

    private String grayimageurl;

    private Integer couponcenter;

    private Date createtime;

    private String createbycode;

    private Date updatetime;

    private String updatebycode;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype == null ? null : coupontype.trim();
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname == null ? null : couponname.trim();
    }

    public String getCouponcode() {
        return couponcode;
    }

    public void setCouponcode(String couponcode) {
        this.couponcode = couponcode == null ? null : couponcode.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public Integer getFullmoney() {
        return fullmoney;
    }

    public void setFullmoney(Integer fullmoney) {
        this.fullmoney = fullmoney;
    }

    public Integer getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(Integer discountmoney) {
        this.discountmoney = discountmoney;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(Integer minmoney) {
        this.minmoney = minmoney;
    }

    public Integer getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(Integer maxmoney) {
        this.maxmoney = maxmoney;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    public Date getExpirestarttime() {
        return expirestarttime;
    }

    public void setExpirestarttime(Date expirestarttime) {
        this.expirestarttime = expirestarttime;
    }

    public Integer getExpiredays() {
        return expiredays;
    }

    public void setExpiredays(Integer expiredays) {
        this.expiredays = expiredays;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getGrayimageurl() {
        return grayimageurl;
    }

    public void setGrayimageurl(String grayimageurl) {
        this.grayimageurl = grayimageurl == null ? null : grayimageurl.trim();
    }

    public Integer getCouponcenter() {
        return couponcenter;
    }

    public void setCouponcenter(Integer couponcenter) {
        this.couponcenter = couponcenter;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatebycode() {
        return createbycode;
    }

    public void setCreatebycode(String createbycode) {
        this.createbycode = createbycode == null ? null : createbycode.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatebycode() {
        return updatebycode;
    }

    public void setUpdatebycode(String updatebycode) {
        this.updatebycode = updatebycode == null ? null : updatebycode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}