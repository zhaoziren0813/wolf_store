package com.wolf.mapper;

import com.wolf.pojo.wl_user_bak;

public interface wl_user_bakMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_bak record);

    int insertSelective(wl_user_bak record);

    wl_user_bak selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_bak record);

    int updateByPrimaryKey(wl_user_bak record);
}