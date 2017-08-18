package com.wolf.mapper;

import com.wolf.pojo.wl_activity_commodity;

public interface wl_activity_commodityMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_commodity record);

    int insertSelective(wl_activity_commodity record);

    wl_activity_commodity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_commodity record);

    int updateByPrimaryKey(wl_activity_commodity record);
}