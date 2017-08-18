package com.wolf.mapper;

import com.wolf.pojo.wl_warehouse;

public interface wl_warehouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(wl_warehouse record);

    int insertSelective(wl_warehouse record);

    wl_warehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(wl_warehouse record);

    int updateByPrimaryKey(wl_warehouse record);
}