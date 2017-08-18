package com.wolf.mapper;

import com.wolf.pojo.wl_group_buy;

public interface wl_group_buyMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_group_buy record);

    int insertSelective(wl_group_buy record);

    wl_group_buy selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_group_buy record);

    int updateByPrimaryKey(wl_group_buy record);
}