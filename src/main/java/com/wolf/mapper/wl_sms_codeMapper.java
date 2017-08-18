package com.wolf.mapper;

import com.wolf.pojo.wl_sms_code;

public interface wl_sms_codeMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_sms_code record);

    int insertSelective(wl_sms_code record);

    wl_sms_code selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_sms_code record);

    int updateByPrimaryKey(wl_sms_code record);
}