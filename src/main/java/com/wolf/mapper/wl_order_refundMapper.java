package com.wolf.mapper;

import com.wolf.pojo.wl_order_refund;

public interface wl_order_refundMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_order_refund record);

    int insertSelective(wl_order_refund record);

    wl_order_refund selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_order_refund record);

    int updateByPrimaryKey(wl_order_refund record);
}