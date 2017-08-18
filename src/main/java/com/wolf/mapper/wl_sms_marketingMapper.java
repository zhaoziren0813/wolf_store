package com.wolf.mapper;

import com.wolf.pojo.wl_sms_marketing;
import com.wolf.pojo.wl_sms_marketingWithBLOBs;

public interface wl_sms_marketingMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_sms_marketingWithBLOBs record);

    int insertSelective(wl_sms_marketingWithBLOBs record);

    wl_sms_marketingWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_sms_marketingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(wl_sms_marketingWithBLOBs record);

    int updateByPrimaryKey(wl_sms_marketing record);
}