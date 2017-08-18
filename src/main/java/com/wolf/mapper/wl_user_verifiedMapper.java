package com.wolf.mapper;

import com.wolf.pojo.wl_user_verified;

public interface wl_user_verifiedMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_verified record);

    int insertSelective(wl_user_verified record);

    wl_user_verified selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_verified record);

    int updateByPrimaryKey(wl_user_verified record);
}