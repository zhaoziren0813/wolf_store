package com.wolf.pojo;

import java.util.Date;

public class wl_user {
    private String id;

    private String openid;

    private String username;

    private String nickname;

    private String phone;

    private String password;

    private Integer money;

    private Integer consumerMoney;

    private Integer integral;

    private String grade;

    private String code;

    private String token;

    private String email;

    private String logo;

    private Integer isVerified;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String reasonremark;

    private Boolean sex;

    private Date birthday;

    private String qqToken;

    private String wechatToken;

    private String sinaToken;

    private String recommendCode;

    private String recommendedCode;

    private String paypassword;

    private Integer balance;

    private Integer isfree;

    private Integer freequota;

    private Integer msglogistics;

    private Integer msgmoney;

    private Integer msgdiscount;

    private Integer msgsystem;

    private Integer msgtotalcount;

    private Integer msgnoreadcount;

    private Integer msgreadcount;

    private Byte isproxy;

    private Byte isshare;

    private Byte ismaster;

    private String alipayaccount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getConsumerMoney() {
        return consumerMoney;
    }

    public void setConsumerMoney(Integer consumerMoney) {
        this.consumerMoney = consumerMoney;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReasonremark() {
        return reasonremark;
    }

    public void setReasonremark(String reasonremark) {
        this.reasonremark = reasonremark == null ? null : reasonremark.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQqToken() {
        return qqToken;
    }

    public void setQqToken(String qqToken) {
        this.qqToken = qqToken == null ? null : qqToken.trim();
    }

    public String getWechatToken() {
        return wechatToken;
    }

    public void setWechatToken(String wechatToken) {
        this.wechatToken = wechatToken == null ? null : wechatToken.trim();
    }

    public String getSinaToken() {
        return sinaToken;
    }

    public void setSinaToken(String sinaToken) {
        this.sinaToken = sinaToken == null ? null : sinaToken.trim();
    }

    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode == null ? null : recommendCode.trim();
    }

    public String getRecommendedCode() {
        return recommendedCode;
    }

    public void setRecommendedCode(String recommendedCode) {
        this.recommendedCode = recommendedCode == null ? null : recommendedCode.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getIsfree() {
        return isfree;
    }

    public void setIsfree(Integer isfree) {
        this.isfree = isfree;
    }

    public Integer getFreequota() {
        return freequota;
    }

    public void setFreequota(Integer freequota) {
        this.freequota = freequota;
    }

    public Integer getMsglogistics() {
        return msglogistics;
    }

    public void setMsglogistics(Integer msglogistics) {
        this.msglogistics = msglogistics;
    }

    public Integer getMsgmoney() {
        return msgmoney;
    }

    public void setMsgmoney(Integer msgmoney) {
        this.msgmoney = msgmoney;
    }

    public Integer getMsgdiscount() {
        return msgdiscount;
    }

    public void setMsgdiscount(Integer msgdiscount) {
        this.msgdiscount = msgdiscount;
    }

    public Integer getMsgsystem() {
        return msgsystem;
    }

    public void setMsgsystem(Integer msgsystem) {
        this.msgsystem = msgsystem;
    }

    public Integer getMsgtotalcount() {
        return msgtotalcount;
    }

    public void setMsgtotalcount(Integer msgtotalcount) {
        this.msgtotalcount = msgtotalcount;
    }

    public Integer getMsgnoreadcount() {
        return msgnoreadcount;
    }

    public void setMsgnoreadcount(Integer msgnoreadcount) {
        this.msgnoreadcount = msgnoreadcount;
    }

    public Integer getMsgreadcount() {
        return msgreadcount;
    }

    public void setMsgreadcount(Integer msgreadcount) {
        this.msgreadcount = msgreadcount;
    }

    public Byte getIsproxy() {
        return isproxy;
    }

    public void setIsproxy(Byte isproxy) {
        this.isproxy = isproxy;
    }

    public Byte getIsshare() {
        return isshare;
    }

    public void setIsshare(Byte isshare) {
        this.isshare = isshare;
    }

    public Byte getIsmaster() {
        return ismaster;
    }

    public void setIsmaster(Byte ismaster) {
        this.ismaster = ismaster;
    }

    public String getAlipayaccount() {
        return alipayaccount;
    }

    public void setAlipayaccount(String alipayaccount) {
        this.alipayaccount = alipayaccount == null ? null : alipayaccount.trim();
    }
}