package com.wolf.mapper;

import com.wolf.pojo.wl_share_order;

public interface wl_share_orderMapper {
    int deleteByPrimaryKey(String orderno);

    int insert(wl_share_order record);

    int insertSelective(wl_share_order record);

    wl_share_order selectByPrimaryKey(String orderno);

    int updateByPrimaryKeySelective(wl_share_order record);

    int updateByPrimaryKey(wl_share_order record);
}