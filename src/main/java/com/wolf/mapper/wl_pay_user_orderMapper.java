package com.wolf.mapper;

import com.wolf.pojo.wl_pay_user_order;

public interface wl_pay_user_orderMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_pay_user_order record);

    int insertSelective(wl_pay_user_order record);

    wl_pay_user_order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_pay_user_order record);

    int updateByPrimaryKey(wl_pay_user_order record);
}