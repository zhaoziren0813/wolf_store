package com.wolf.mapper;

import com.wolf.pojo.wl_user_role;

public interface wl_user_roleMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_role record);

    int insertSelective(wl_user_role record);

    wl_user_role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_role record);

    int updateByPrimaryKey(wl_user_role record);
}