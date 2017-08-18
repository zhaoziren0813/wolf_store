package com.wolf.mapper;

import com.wolf.pojo.wl_user_address;

public interface wl_user_addressMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_address record);

    int insertSelective(wl_user_address record);

    wl_user_address selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_address record);

    int updateByPrimaryKey(wl_user_address record);
}