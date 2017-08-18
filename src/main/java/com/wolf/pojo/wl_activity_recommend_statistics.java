package com.wolf.pojo;

import java.util.Date;

public class wl_activity_recommend_statistics {
    private String id;

    private String recommenduserid;

    private Integer recommendcount;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecommenduserid() {
        return recommenduserid;
    }

    public void setRecommenduserid(String recommenduserid) {
        this.recommenduserid = recommenduserid == null ? null : recommenduserid.trim();
    }

    public Integer getRecommendcount() {
        return recommendcount;
    }

    public void setRecommendcount(Integer recommendcount) {
        this.recommendcount = recommendcount;
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