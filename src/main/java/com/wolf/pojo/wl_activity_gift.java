package com.wolf.pojo;

import java.util.Date;

public class wl_activity_gift {
    private String id;

    private String giftcode;

    private String giftname;

    private String giftdesc;

    private Integer giftintegral;

    private Integer giftlimit;

    private Date starttime;

    private Date expiredtime;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGiftcode() {
        return giftcode;
    }

    public void setGiftcode(String giftcode) {
        this.giftcode = giftcode == null ? null : giftcode.trim();
    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname == null ? null : giftname.trim();
    }

    public String getGiftdesc() {
        return giftdesc;
    }

    public void setGiftdesc(String giftdesc) {
        this.giftdesc = giftdesc == null ? null : giftdesc.trim();
    }

    public Integer getGiftintegral() {
        return giftintegral;
    }

    public void setGiftintegral(Integer giftintegral) {
        this.giftintegral = giftintegral;
    }

    public Integer getGiftlimit() {
        return giftlimit;
    }

    public void setGiftlimit(Integer giftlimit) {
        this.giftlimit = giftlimit;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getExpiredtime() {
        return expiredtime;
    }

    public void setExpiredtime(Date expiredtime) {
        this.expiredtime = expiredtime;
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