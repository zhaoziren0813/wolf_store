package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_inventory;

public interface wl_commodity_inventoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_inventory record);

    int insertSelective(wl_commodity_inventory record);

    wl_commodity_inventory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_inventory record);

    int updateByPrimaryKey(wl_commodity_inventory record);
}