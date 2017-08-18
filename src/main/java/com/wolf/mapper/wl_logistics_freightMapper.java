package com.wolf.mapper;

import com.wolf.pojo.wl_logistics_freight;

public interface wl_logistics_freightMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_logistics_freight record);

    int insertSelective(wl_logistics_freight record);

    wl_logistics_freight selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_logistics_freight record);

    int updateByPrimaryKey(wl_logistics_freight record);
}