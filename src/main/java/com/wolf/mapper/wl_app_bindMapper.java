package com.wolf.mapper;

import com.wolf.pojo.wl_app_bind;

public interface wl_app_bindMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_app_bind record);

    int insertSelective(wl_app_bind record);

    wl_app_bind selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_app_bind record);

    int updateByPrimaryKey(wl_app_bind record);
}