package com.wolf.pojo;

import java.util.Date;

public class wl_activity_lucky {
    private String id;

    private Integer luckytype;

    private String luckycode;

    private String luckyname;

    private String luckydesc;

    private String luckyimage;

    private String luckybackimage;

    private Date begintime;

    private Date endtime;

    private String repeattips;

    private Integer probability;

    private Integer counttype;

    private Integer mostcount;

    private Integer daycount;

    private Date createtime;

    private String createuserid;

    private Date updatetime;

    private String updateuserid;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getLuckytype() {
        return luckytype;
    }

    public void setLuckytype(Integer luckytype) {
        this.luckytype = luckytype;
    }

    public String getLuckycode() {
        return luckycode;
    }

    public void setLuckycode(String luckycode) {
        this.luckycode = luckycode == null ? null : luckycode.trim();
    }

    public String getLuckyname() {
        return luckyname;
    }

    public void setLuckyname(String luckyname) {
        this.luckyname = luckyname == null ? null : luckyname.trim();
    }

    public String getLuckydesc() {
        return luckydesc;
    }

    public void setLuckydesc(String luckydesc) {
        this.luckydesc = luckydesc == null ? null : luckydesc.trim();
    }

    public String getLuckyimage() {
        return luckyimage;
    }

    public void setLuckyimage(String luckyimage) {
        this.luckyimage = luckyimage == null ? null : luckyimage.trim();
    }

    public String getLuckybackimage() {
        return luckybackimage;
    }

    public void setLuckybackimage(String luckybackimage) {
        this.luckybackimage = luckybackimage == null ? null : luckybackimage.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getRepeattips() {
        return repeattips;
    }

    public void setRepeattips(String repeattips) {
        this.repeattips = repeattips == null ? null : repeattips.trim();
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Integer getCounttype() {
        return counttype;
    }

    public void setCounttype(Integer counttype) {
        this.counttype = counttype;
    }

    public Integer getMostcount() {
        return mostcount;
    }

    public void setMostcount(Integer mostcount) {
        this.mostcount = mostcount;
    }

    public Integer getDaycount() {
        return daycount;
    }

    public void setDaycount(Integer daycount) {
        this.daycount = daycount;
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}