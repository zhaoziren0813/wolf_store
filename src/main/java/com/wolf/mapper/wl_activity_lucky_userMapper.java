package com.wolf.mapper;

import com.wolf.pojo.wl_activity_lucky_user;

public interface wl_activity_lucky_userMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_lucky_user record);

    int insertSelective(wl_activity_lucky_user record);

    wl_activity_lucky_user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_lucky_user record);

    int updateByPrimaryKey(wl_activity_lucky_user record);
}