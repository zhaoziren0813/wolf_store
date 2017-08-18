package com.wolf.pojo;

import java.util.Date;

public class wl_order_refund {
    private String id;

    private String refundorderno;

    private String orderno;

    private String orderdetailid;

    private String userid;

    private String commodityid;

    private String inventoryid;

    private Integer refundcount;

    private Integer refundreason;

    private String refunddescription;

    private String refundimages;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private String auditdescription;

    private String auditor;

    private Integer auditstate;

    private String logisticscode;

    private String logisticsno;

    private String logisticsname;

    private Integer refundmoney;

    private Integer refundmoneystatus;

    private Integer paymoney;

    private Integer paystatus;

    private Integer refundintegral;

    private Integer refundbalance;

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

    public Integer getRefundcount() {
        return refundcount;
    }

    public void setRefundcount(Integer refundcount) {
        this.refundcount = refundcount;
    }

    public Integer getRefundreason() {
        return refundreason;
    }

    public void setRefundreason(Integer refundreason) {
        this.refundreason = refundreason;
    }

    public String getRefunddescription() {
        return refunddescription;
    }

    public void setRefunddescription(String refunddescription) {
        this.refunddescription = refunddescription == null ? null : refunddescription.trim();
    }

    public String getRefundimages() {
        return refundimages;
    }

    public void setRefundimages(String refundimages) {
        this.refundimages = refundimages == null ? null : refundimages.trim();
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

    public String getAuditdescription() {
        return auditdescription;
    }

    public void setAuditdescription(String auditdescription) {
        this.auditdescription = auditdescription == null ? null : auditdescription.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Integer getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(Integer auditstate) {
        this.auditstate = auditstate;
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

    public Integer getRefundintegral() {
        return refundintegral;
    }

    public void setRefundintegral(Integer refundintegral) {
        this.refundintegral = refundintegral;
    }

    public Integer getRefundbalance() {
        return refundbalance;
    }

    public void setRefundbalance(Integer refundbalance) {
        this.refundbalance = refundbalance;
    }
}