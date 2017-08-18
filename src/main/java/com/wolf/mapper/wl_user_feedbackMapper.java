package com.wolf.mapper;

import com.wolf.pojo.wl_user_feedback;

public interface wl_user_feedbackMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_feedback record);

    int insertSelective(wl_user_feedback record);

    wl_user_feedback selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_feedback record);

    int updateByPrimaryKey(wl_user_feedback record);
}