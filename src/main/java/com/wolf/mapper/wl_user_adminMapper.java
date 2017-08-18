package com.wolf.mapper;

import com.wolf.pojo.wl_user_admin;

public interface wl_user_adminMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_admin record);

    int insertSelective(wl_user_admin record);

    wl_user_admin selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_admin record);

    int updateByPrimaryKey(wl_user_admin record);
}