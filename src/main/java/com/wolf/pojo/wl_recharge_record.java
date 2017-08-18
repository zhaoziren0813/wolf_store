package com.wolf.pojo;

import java.util.Date;

public class wl_recharge_record {
    private String id;

    private String rechargeno;

    private Integer operatortype;

    private String operator;

    private Integer operate;

    private Integer paymoney;

    private String description;

    private Date createtime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRechargeno() {
        return rechargeno;
    }

    public void setRechargeno(String rechargeno) {
        this.rechargeno = rechargeno == null ? null : rechargeno.trim();
    }

    public Integer getOperatortype() {
        return operatortype;
    }

    public void setOperatortype(Integer operatortype) {
        this.operatortype = operatortype;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}