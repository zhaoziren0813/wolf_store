package com.wolf.pojo;

public class wl_user_role_competences {
    private String id;

    private String roleid;

    private String competenceid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getCompetenceid() {
        return competenceid;
    }

    public void setCompetenceid(String competenceid) {
        this.competenceid = competenceid == null ? null : competenceid.trim();
    }
}