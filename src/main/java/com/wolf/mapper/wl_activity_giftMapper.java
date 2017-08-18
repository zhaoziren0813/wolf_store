package com.wolf.mapper;

import com.wolf.pojo.wl_activity_gift;

public interface wl_activity_giftMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_gift record);

    int insertSelective(wl_activity_gift record);

    wl_activity_gift selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_gift record);

    int updateByPrimaryKey(wl_activity_gift record);
}