package com.wolf.mapper;

import com.wolf.pojo.wl_activity_recommend;

public interface wl_activity_recommendMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_recommend record);

    int insertSelective(wl_activity_recommend record);

    wl_activity_recommend selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_recommend record);

    int updateByPrimaryKey(wl_activity_recommend record);
}