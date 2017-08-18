package com.wolf.mapper;

import com.wolf.pojo.wl_order_detail;

public interface wl_order_detailMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_order_detail record);

    int insertSelective(wl_order_detail record);

    wl_order_detail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_order_detail record);

    int updateByPrimaryKey(wl_order_detail record);
}