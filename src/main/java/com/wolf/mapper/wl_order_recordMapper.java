package com.wolf.mapper;

import com.wolf.pojo.wl_order_record;

public interface wl_order_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_order_record record);

    int insertSelective(wl_order_record record);

    wl_order_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_order_record record);

    int updateByPrimaryKey(wl_order_record record);
}