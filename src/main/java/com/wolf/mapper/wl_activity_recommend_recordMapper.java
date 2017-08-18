package com.wolf.mapper;

import com.wolf.pojo.wl_activity_recommend_record;

public interface wl_activity_recommend_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_recommend_record record);

    int insertSelective(wl_activity_recommend_record record);

    wl_activity_recommend_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_recommend_record record);

    int updateByPrimaryKey(wl_activity_recommend_record record);
}