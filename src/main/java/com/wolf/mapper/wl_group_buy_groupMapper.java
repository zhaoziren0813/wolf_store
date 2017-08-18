package com.wolf.mapper;

import com.wolf.pojo.wl_group_buy_group;

public interface wl_group_buy_groupMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_group_buy_group record);

    int insertSelective(wl_group_buy_group record);

    wl_group_buy_group selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_group_buy_group record);

    int updateByPrimaryKey(wl_group_buy_group record);
}