package com.wolf.mapper;

import com.wolf.pojo.wl_app_update_information;

public interface wl_app_update_informationMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_app_update_information record);

    int insertSelective(wl_app_update_information record);

    wl_app_update_information selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_app_update_information record);

    int updateByPrimaryKey(wl_app_update_information record);
}