package com.wolf.pojo;

import java.util.Date;

public class wl_withdraw_record {
    private String id;

    private String withdrawno;

    private Integer operatortype;

    private String operator;

    private Date createtime;

    private String discription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWithdrawno() {
        return withdrawno;
    }

    public void setWithdrawno(String withdrawno) {
        this.withdrawno = withdrawno == null ? null : withdrawno.trim();
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }
}