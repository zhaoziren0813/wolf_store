package com.wolf.pojo;

import java.util.Date;

public class wl_community_comment_like {
    private String id;

    private String communitycommentid;

    private String userid;

    private Integer liketype;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommunitycommentid() {
        return communitycommentid;
    }

    public void setCommunitycommentid(String communitycommentid) {
        this.communitycommentid = communitycommentid == null ? null : communitycommentid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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
}