package com.wolf.pojo;

import java.util.Date;

public class wl_refund_detail {
    private String id;

    private String refundorderno;

    private String orderno;

    private String orderdetailid;

    private Integer refundmoney;

    private Integer refundmoneystatus;

    private Date createtime;

    private Date updatetime;

    private Integer paymoney;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRefundorderno() {
        return refundorderno;
    }

    public void setRefundorderno(String refundorderno) {
        this.refundorderno = refundorderno == null ? null : refundorderno.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(String orderdetailid) {
        this.orderdetailid = orderdetailid == null ? null : orderdetailid.trim();
    }

    public Integer getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(Integer refundmoney) {
        this.refundmoney = refundmoney;
    }

    public Integer getRefundmoneystatus() {
        return refundmoneystatus;
    }

    public void setRefundmoneystatus(Integer refundmoneystatus) {
        this.refundmoneystatus = refundmoneystatus;
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

    public Integer getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Integer paymoney) {
        this.paymoney = paymoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}