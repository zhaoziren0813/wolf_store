package com.wolf.mapper;

import com.wolf.pojo.wl_user_info;

public interface wl_user_infoMapper {
    int deleteByPrimaryKey(String mobile);

    int insert(wl_user_info record);

    int insertSelective(wl_user_info record);

    wl_user_info selectByPrimaryKey(String mobile);

    int updateByPrimaryKeySelective(wl_user_info record);

    int updateByPrimaryKey(wl_user_info record);
}