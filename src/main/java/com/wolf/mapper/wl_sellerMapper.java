package com.wolf.mapper;

import com.wolf.pojo.wl_seller;

public interface wl_sellerMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_seller record);

    int insertSelective(wl_seller record);

    wl_seller selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_seller record);

    int updateByPrimaryKey(wl_seller record);
}