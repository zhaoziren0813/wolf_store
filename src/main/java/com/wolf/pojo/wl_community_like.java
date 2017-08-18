package com.wolf.pojo;

import java.util.Date;

public class wl_community_like {
    private String id;

    private String communityid;

    private String userid;

    private Integer collectiontype;

    private Integer liketype;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommunityid() {
        return communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid == null ? null : communityid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getCollectiontype() {
        return collectiontype;
    }

    public void setCollectiontype(Integer collectiontype) {
        this.collectiontype = collectiontype;
    }

    public Integer getLiketype() {
        return liketype;
    }

    public void setLiketype(Integer liketype) {
        this.liketype = liketype;
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
}