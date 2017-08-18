package com.wolf.mapper;

import com.wolf.pojo.wl_activity_config;

public interface wl_activity_configMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_config record);

    int insertSelective(wl_activity_config record);

    wl_activity_config selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_config record);

    int updateByPrimaryKey(wl_activity_config record);
}