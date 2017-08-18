package com.wolf.pojo;

import java.util.Date;

public class wl_order_pay {
    private String id;

    private String outtradeno;

    private String paytype;

    private String paystatus;

    private Date starttime;

    private Date expiretime;

    private String createbycode;

    private Date createtime;

    private String updatebycode;

    private Date updatetime;

    private String actualouttradeno;

    private String ordernos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOuttradeno() {
        return outtradeno;
    }

    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno == null ? null : outtradeno.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus == null ? null : paystatus.trim();
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

    public String getCreatebycode() {
        return createbycode;
    }

    public void setCreatebycode(String createbycode) {
        this.createbycode = createbycode == null ? null : createbycode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdatebycode() {
        return updatebycode;
    }

    public void setUpdatebycode(String updatebycode) {
        this.updatebycode = updatebycode == null ? null : updatebycode.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getActualouttradeno() {
        return actualouttradeno;
    }

    public void setActualouttradeno(String actualouttradeno) {
        this.actualouttradeno = actualouttradeno == null ? null : actualouttradeno.trim();
    }

    public String getOrdernos() {
        return ordernos;
    }

    public void setOrdernos(String ordernos) {
        this.ordernos = ordernos == null ? null : ordernos.trim();
    }
}