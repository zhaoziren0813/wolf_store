package com.wolf.mapper;

import com.wolf.pojo.wl_user;

public interface wl_userMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user record);

    int insertSelective(wl_user record);

    wl_user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user record);

    int updateByPrimaryKey(wl_user record);
}