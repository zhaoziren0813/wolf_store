package com.wolf.mapper;

import com.wolf.pojo.wl_offline_activity;

public interface wl_offline_activityMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_offline_activity record);

    int insertSelective(wl_offline_activity record);

    wl_offline_activity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_offline_activity record);

    int updateByPrimaryKey(wl_offline_activity record);
}