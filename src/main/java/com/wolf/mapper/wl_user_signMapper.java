package com.wolf.mapper;

import com.wolf.pojo.wl_user_sign;

public interface wl_user_signMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_sign record);

    int insertSelective(wl_user_sign record);

    wl_user_sign selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_sign record);

    int updateByPrimaryKey(wl_user_sign record);
}