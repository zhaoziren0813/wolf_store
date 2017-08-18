package com.wolf.mapper;

import com.wolf.pojo.wl_order_pay;

public interface wl_order_payMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_order_pay record);

    int insertSelective(wl_order_pay record);

    wl_order_pay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_order_pay record);

    int updateByPrimaryKeyWithBLOBs(wl_order_pay record);

    int updateByPrimaryKey(wl_order_pay record);
}