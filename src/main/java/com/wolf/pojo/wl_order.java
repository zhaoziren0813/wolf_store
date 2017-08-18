package com.wolf.pojo;

import java.util.Date;

public class wl_order {
    private String id;

    private Integer ordertype;

    private String orderno;

    private Integer channel;

    private String userid;

    private String groupbuyuserid;

    private String token;

    private Integer mastermoney;

    private Integer ordermoney;

    private Integer discountmoney;

    private Integer freight;

    private Integer freefreight;

    private Integer amountmoney;

    private Integer paytype;

    private Integer paymoney;

    private Integer paystatus;

    private Date paytime;

    private String paydocument;

    private String mchid;

    private String tradeno;

    private Integer useintegraltotal;

    private Integer usebalancetotal;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private String logisticscode;

    private String logisticsno;

    private String logisticsname;

    private String addressid;

    private String couponid;

    private Integer allrefund;

    private Integer allcomment;

    private String logisticsstatus;

    private String proxyid;

    private String shareid;

    private Integer sharecommission;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getGroupbuyuserid() {
        return groupbuyuserid;
    }

    public void setGroupbuyuserid(String groupbuyuserid) {
        this.groupbuyuserid = groupbuyuserid == null ? null : groupbuyuserid.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getMastermoney() {
        return mastermoney;
    }

    public void setMastermoney(Integer mastermoney) {
        this.mastermoney = mastermoney;
    }

    public Integer getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(Integer ordermoney) {
        this.ordermoney = ordermoney;
    }

    public Integer getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(Integer discountmoney) {
        this.discountmoney = discountmoney;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getFreefreight() {
        return freefreight;
    }

    public void setFreefreight(Integer freefreight) {
        this.freefreight = freefreight;
    }

    public Integer getAmountmoney() {
        return amountmoney;
    }

    public void setAmountmoney(Integer amountmoney) {
        this.amountmoney = amountmoney;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Integer paymoney) {
        this.paymoney = paymoney;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getPaydocument() {
        return paydocument;
    }

    public void setPaydocument(String paydocument) {
        this.paydocument = paydocument == null ? null : paydocument.trim();
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid == null ? null : mchid.trim();
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public Integer getUseintegraltotal() {
        return useintegraltotal;
    }

    public void setUseintegraltotal(Integer useintegraltotal) {
        this.useintegraltotal = useintegraltotal;
    }

    public Integer getUsebalancetotal() {
        return usebalancetotal;
    }

    public void setUsebalancetotal(Integer usebalancetotal) {
        this.usebalancetotal = usebalancetotal;
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

    public String getLogisticscode() {
        return logisticscode;
    }

    public void setLogisticscode(String logisticscode) {
        this.logisticscode = logisticscode == null ? null : logisticscode.trim();
    }

    public String getLogisticsno() {
        return logisticsno;
    }

    public void setLogisticsno(String logisticsno) {
        this.logisticsno = logisticsno == null ? null : logisticsno.trim();
    }

    public String getLogisticsname() {
        return logisticsname;
    }

    public void setLogisticsname(String logisticsname) {
        this.logisticsname = logisticsname == null ? null : logisticsname.trim();
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid == null ? null : couponid.trim();
    }

    public Integer getAllrefund() {
        return allrefund;
    }

    public void setAllrefund(Integer allrefund) {
        this.allrefund = allrefund;
    }

    public Integer getAllcomment() {
        return allcomment;
    }

    public void setAllcomment(Integer allcomment) {
        this.allcomment = allcomment;
    }

    public String getLogisticsstatus() {
        return logisticsstatus;
    }

    public void setLogisticsstatus(String logisticsstatus) {
        this.logisticsstatus = logisticsstatus == null ? null : logisticsstatus.trim();
    }

    public String getProxyid() {
        return proxyid;
    }

    public void setProxyid(String proxyid) {
        this.proxyid = proxyid == null ? null : proxyid.trim();
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
}