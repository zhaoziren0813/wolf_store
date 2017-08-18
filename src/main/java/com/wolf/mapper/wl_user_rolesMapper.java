package com.wolf.mapper;

import com.wolf.pojo.wl_user_roles;

public interface wl_user_rolesMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_roles record);

    int insertSelective(wl_user_roles record);

    wl_user_roles selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_roles record);

    int updateByPrimaryKey(wl_user_roles record);
}