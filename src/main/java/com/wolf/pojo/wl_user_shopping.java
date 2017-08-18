package com.wolf.pojo;

import com.wolf.pojo.wl_user_shoppingKey;

import java.util.Date;

public class wl_user_shopping extends wl_user_shoppingKey {
    private Date createtime;

    private Integer quantity;

    private Integer checked;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }
}