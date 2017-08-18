package com.wolf.pojo;

import java.util.Date;

public class wl_commodity_inventory_record {
    private String id;

    private String commodityid;

    private String inventoryid;

    private String property;

    private String operateplatform;

    private Integer operatetype;

    private Integer operatequantity;

    private String sourcewarehouse;

    private String targetwarehouse;

    private Date createtime;

    private String createuserid;

    private Integer status;

    private Integer logisticfee;

    private Integer packagingfee;

    private Integer purchaseprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public String getOperateplatform() {
        return operateplatform;
    }

    public void setOperateplatform(String operateplatform) {
        this.operateplatform = operateplatform == null ? null : operateplatform.trim();
    }

    public Integer getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(Integer operatetype) {
        this.operatetype = operatetype;
    }

    public Integer getOperatequantity() {
        return operatequantity;
    }

    public void setOperatequantity(Integer operatequantity) {
        this.operatequantity = operatequantity;
    }

    public String getSourcewarehouse() {
        return sourcewarehouse;
    }

    public void setSourcewarehouse(String sourcewarehouse) {
        this.sourcewarehouse = sourcewarehouse == null ? null : sourcewarehouse.trim();
    }

    public String getTargetwarehouse() {
        return targetwarehouse;
    }

    public void setTargetwarehouse(String targetwarehouse) {
        this.targetwarehouse = targetwarehouse == null ? null : targetwarehouse.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLogisticfee() {
        return logisticfee;
    }

    public void setLogisticfee(Integer logisticfee) {
        this.logisticfee = logisticfee;
    }

    public Integer getPackagingfee() {
        return packagingfee;
    }

    public void setPackagingfee(Integer packagingfee) {
        this.packagingfee = packagingfee;
    }

    public Integer getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Integer purchaseprice) {
        this.purchaseprice = purchaseprice;
    }
}