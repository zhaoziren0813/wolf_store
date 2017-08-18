package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_inventory_record;

public interface wl_commodity_inventory_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_inventory_record record);

    int insertSelective(wl_commodity_inventory_record record);

    wl_commodity_inventory_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_inventory_record record);

    int updateByPrimaryKey(wl_commodity_inventory_record record);
}