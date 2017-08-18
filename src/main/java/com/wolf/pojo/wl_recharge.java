package com.wolf.pojo;

import java.util.Date;

public class wl_recharge {
    private String id;

    private Integer channel;

    private String userid;

    private String rechargeno;

    private Integer rechargemoney;

    private Integer paymoney;

    private Integer useintegraltotal;

    private Integer rechargetype;

    private Date rechargetime;

    private Integer rechargediscount;

    private String paydocument;

    private String outtradeno;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getRechargeno() {
        return rechargeno;
    }

    public void setRechargeno(String rechargeno) {
        this.rechargeno = rechargeno == null ? null : rechargeno.trim();
    }

    public Integer getRechargemoney() {
        return rechargemoney;
    }

    public void setRechargemoney(Integer rechargemoney) {
        this.rechargemoney = rechargemoney;
    }

    public Integer getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Integer paymoney) {
        this.paymoney = paymoney;
    }

    public Integer getUseintegraltotal() {
        return useintegraltotal;
    }

    public void setUseintegraltotal(Integer useintegraltotal) {
        this.useintegraltotal = useintegraltotal;
    }

    public Integer getRechargetype() {
        return rechargetype;
    }

    public void setRechargetype(Integer rechargetype) {
        this.rechargetype = rechargetype;
    }

    public Date getRechargetime() {
        return rechargetime;
    }

    public void setRechargetime(Date rechargetime) {
        this.rechargetime = rechargetime;
    }

    public Integer getRechargediscount() {
        return rechargediscount;
    }

    public void setRechargediscount(Integer rechargediscount) {
        this.rechargediscount = rechargediscount;
    }

    public String getPaydocument() {
        return paydocument;
    }

    public void setPaydocument(String paydocument) {
        this.paydocument = paydocument == null ? null : paydocument.trim();
    }

    public String getOuttradeno() {
        return outtradeno;
    }

    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno == null ? null : outtradeno.trim();
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
}