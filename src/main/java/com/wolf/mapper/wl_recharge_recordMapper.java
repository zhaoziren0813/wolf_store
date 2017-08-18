package com.wolf.mapper;

import com.wolf.pojo.wl_recharge_record;

public interface wl_recharge_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_recharge_record record);

    int insertSelective(wl_recharge_record record);

    wl_recharge_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_recharge_record record);

    int updateByPrimaryKey(wl_recharge_record record);
}