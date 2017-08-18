package com.wolf.pojo;

import java.util.Date;

public class wl_group_buy {
    private String id;

    private String groupbuyname;

    private String groupbuydesc;

    private String groupbuyimage;

    private String commodityid;

    private String inventoryid;

    private String property;

    private Integer oprice;

    private Integer groupbuyprice;

    private Integer minimumnumber;

    private Integer maximumnumber;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private Date begintime;

    private Date endtime;

    private Boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupbuyname() {
        return groupbuyname;
    }

    public void setGroupbuyname(String groupbuyname) {
        this.groupbuyname = groupbuyname == null ? null : groupbuyname.trim();
    }

    public String getGroupbuydesc() {
        return groupbuydesc;
    }

    public void setGroupbuydesc(String groupbuydesc) {
        this.groupbuydesc = groupbuydesc == null ? null : groupbuydesc.trim();
    }

    public String getGroupbuyimage() {
        return groupbuyimage;
    }

    public void setGroupbuyimage(String groupbuyimage) {
        this.groupbuyimage = groupbuyimage == null ? null : groupbuyimage.trim();
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid == null ? null : inventoryid.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public Integer getOprice() {
        return oprice;
    }

    public void setOprice(Integer oprice) {
        this.oprice = oprice;
    }

    public Integer getGroupbuyprice() {
        return groupbuyprice;
    }

    public void setGroupbuyprice(Integer groupbuyprice) {
        this.groupbuyprice = groupbuyprice;
    }

    public Integer getMinimumnumber() {
        return minimumnumber;
    }

    public void setMinimumnumber(Integer minimumnumber) {
        this.minimumnumber = minimumnumber;
    }

    public Integer getMaximumnumber() {
        return maximumnumber;
    }

    public void setMaximumnumber(Integer maximumnumber) {
        this.maximumnumber = maximumnumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}