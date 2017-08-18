package com.wolf.mapper;

import com.wolf.pojo.wl_withdraw;

public interface wl_withdrawMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_withdraw record);

    int insertSelective(wl_withdraw record);

    wl_withdraw selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_withdraw record);

    int updateByPrimaryKey(wl_withdraw record);
}