package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_placeorigin;

public interface wl_commodity_placeoriginMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_placeorigin record);

    int insertSelective(wl_commodity_placeorigin record);

    wl_commodity_placeorigin selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_placeorigin record);

    int updateByPrimaryKey(wl_commodity_placeorigin record);
}