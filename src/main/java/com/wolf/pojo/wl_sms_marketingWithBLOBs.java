package com.wolf.pojo;

import com.wolf.pojo.wl_sms_marketing;

public class wl_sms_marketingWithBLOBs extends wl_sms_marketing {
    private String mobile;

    private String content;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}