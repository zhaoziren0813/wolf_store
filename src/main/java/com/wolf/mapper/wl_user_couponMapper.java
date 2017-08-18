package com.wolf.mapper;

import com.wolf.pojo.wl_user_coupon;

public interface wl_user_couponMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_coupon record);

    int insertSelective(wl_user_coupon record);

    wl_user_coupon selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_coupon record);

    int updateByPrimaryKey(wl_user_coupon record);
}