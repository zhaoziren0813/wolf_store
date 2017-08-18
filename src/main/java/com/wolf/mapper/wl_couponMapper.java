package com.wolf.mapper;

import com.wolf.pojo.wl_coupon;

public interface wl_couponMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_coupon record);

    int insertSelective(wl_coupon record);

    wl_coupon selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_coupon record);

    int updateByPrimaryKey(wl_coupon record);
}