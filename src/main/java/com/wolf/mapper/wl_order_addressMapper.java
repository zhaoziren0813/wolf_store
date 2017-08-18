package com.wolf.mapper;

import com.wolf.pojo.wl_order_address;

public interface wl_order_addressMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_order_address record);

    int insertSelective(wl_order_address record);

    wl_order_address selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_order_address record);

    int updateByPrimaryKey(wl_order_address record);
}