package com.wolf.pojo;

public class wl_user_competence {
    private String id;

    private String competencename;

    private String competencecode;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompetencename() {
        return competencename;
    }

    public void setCompetencename(String competencename) {
        this.competencename = competencename == null ? null : competencename.trim();
    }

    public String getCompetencecode() {
        return competencecode;
    }

    public void setCompetencecode(String competencecode) {
        this.competencecode = competencecode == null ? null : competencecode.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}