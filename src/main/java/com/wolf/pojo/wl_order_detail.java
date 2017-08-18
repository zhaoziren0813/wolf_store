package com.wolf.pojo;

import java.util.Date;

public class wl_order_detail {
    private String id;

    private Integer canrefunds;

    private String orderno;

    private String groupbuyuserid;

    private String userid;

    private String commodityid;

    private String commodityname;

    private String inventoryid;

    private String property;

    private String image;

    private Integer price;

    private Integer quantity;

    private Integer money;

    private Integer discountmoney;

    private Integer useintegral;

    private Integer usebalance;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private Integer comment;

    private String proxyids;

    private String proxycommodityquantity;

    private Integer proxycommission;

    private String shareid;

    private Integer sharecommission;

    private Integer mastermoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCanrefunds() {
        return canrefunds;
    }

    public void setCanrefunds(Integer canrefunds) {
        this.canrefunds = canrefunds;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getGroupbuyuserid() {
        return groupbuyuserid;
    }

    public void setGroupbuyuserid(String groupbuyuserid) {
        this.groupbuyuserid = groupbuyuserid == null ? null : groupbuyuserid.trim();
    }

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

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid == null ? null : inventoryid.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(Integer discountmoney) {
        this.discountmoney = discountmoney;
    }

    public Integer getUseintegral() {
        return useintegral;
    }

    public void setUseintegral(Integer useintegral) {
        this.useintegral = useintegral;
    }

    public Integer getUsebalance() {
        return usebalance;
    }

    public void setUsebalance(Integer usebalance) {
        this.usebalance = usebalance;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public String getProxyids() {
        return proxyids;
    }

    public void setProxyids(String proxyids) {
        this.proxyids = proxyids == null ? null : proxyids.trim();
    }

    public String getProxycommodityquantity() {
        return proxycommodityquantity;
    }

    public void setProxycommodityquantity(String proxycommodityquantity) {
        this.proxycommodityquantity = proxycommodityquantity == null ? null : proxycommodityquantity.trim();
    }

    public Integer getProxycommission() {
        return proxycommission;
    }

    public void setProxycommission(Integer proxycommission) {
        this.proxycommission = proxycommission;
    }

    public String getShareid() {
        return shareid;
    }

    public void setShareid(String shareid) {
        this.shareid = shareid == null ? null : shareid.trim();
    }

    public Integer getSharecommission() {
        return sharecommission;
    }

    public void setSharecommission(Integer sharecommission) {
        this.sharecommission = sharecommission;
    }

    public Integer getMastermoney() {
        return mastermoney;
    }

    public void setMastermoney(Integer mastermoney) {
        this.mastermoney = mastermoney;
    }
}