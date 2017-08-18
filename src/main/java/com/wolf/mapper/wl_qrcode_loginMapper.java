package com.wolf.mapper;

import com.wolf.pojo.wl_qrcode_login;

public interface wl_qrcode_loginMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_qrcode_login record);

    int insertSelective(wl_qrcode_login record);

    wl_qrcode_login selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_qrcode_login record);

    int updateByPrimaryKey(wl_qrcode_login record);
}