package com.wolf.mapper;

import com.wolf.pojo.wl_activity_recommend_statistics;

public interface wl_activity_recommend_statisticsMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_recommend_statistics record);

    int insertSelective(wl_activity_recommend_statistics record);

    wl_activity_recommend_statistics selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_recommend_statistics record);

    int updateByPrimaryKey(wl_activity_recommend_statistics record);
}