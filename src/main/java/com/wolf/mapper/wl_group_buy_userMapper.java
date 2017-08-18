package com.wolf.mapper;

import com.wolf.pojo.wl_group_buy_user;

public interface wl_group_buy_userMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_group_buy_user record);

    int insertSelective(wl_group_buy_user record);

    wl_group_buy_user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_group_buy_user record);

    int updateByPrimaryKey(wl_group_buy_user record);
}