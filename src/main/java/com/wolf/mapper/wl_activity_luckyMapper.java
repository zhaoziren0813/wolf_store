package com.wolf.mapper;

import com.wolf.pojo.wl_activity_lucky;

public interface wl_activity_luckyMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_lucky record);

    int insertSelective(wl_activity_lucky record);

    wl_activity_lucky selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_lucky record);

    int updateByPrimaryKey(wl_activity_lucky record);
}