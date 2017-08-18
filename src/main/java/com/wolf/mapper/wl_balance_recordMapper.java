package com.wolf.mapper;

import com.wolf.pojo.wl_balance_record;

public interface wl_balance_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_balance_record record);

    int insertSelective(wl_balance_record record);

    wl_balance_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_balance_record record);

    int updateByPrimaryKey(wl_balance_record record);
}