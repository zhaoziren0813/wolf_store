package com.wolf.mapper;

import com.wolf.pojo.wl_sms_marketing_relation;

public interface wl_sms_marketing_relationMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_sms_marketing_relation record);

    int insertSelective(wl_sms_marketing_relation record);

    wl_sms_marketing_relation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_sms_marketing_relation record);

    int updateByPrimaryKey(wl_sms_marketing_relation record);
}