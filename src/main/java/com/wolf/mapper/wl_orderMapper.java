package com.wolf.mapper;

import com.wolf.pojo.wl_order;

public interface wl_orderMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_order record);

    int insertSelective(wl_order record);

    wl_order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_order record);

    int updateByPrimaryKey(wl_order record);
}