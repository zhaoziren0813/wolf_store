package com.wolf.mapper;

import com.wolf.pojo.wl_withdraw_record;

public interface wl_withdraw_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_withdraw_record record);

    int insertSelective(wl_withdraw_record record);

    wl_withdraw_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_withdraw_record record);

    int updateByPrimaryKey(wl_withdraw_record record);
}