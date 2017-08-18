package com.wolf.mapper;

import com.wolf.pojo.wl_activity_model_enter;

public interface wl_activity_model_enterMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_model_enter record);

    int insertSelective(wl_activity_model_enter record);

    wl_activity_model_enter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_model_enter record);

    int updateByPrimaryKey(wl_activity_model_enter record);
}