package com.wolf.mapper;

import com.wolf.pojo.wl_school_activity;

public interface wl_school_activityMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_school_activity record);

    int insertSelective(wl_school_activity record);

    wl_school_activity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_school_activity record);

    int updateByPrimaryKey(wl_school_activity record);
}