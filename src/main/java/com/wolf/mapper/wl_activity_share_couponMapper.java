package com.wolf.mapper;

import com.wolf.pojo.wl_activity_share_coupon;

public interface wl_activity_share_couponMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_share_coupon record);

    int insertSelective(wl_activity_share_coupon record);

    wl_activity_share_coupon selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_share_coupon record);

    int updateByPrimaryKey(wl_activity_share_coupon record);
}