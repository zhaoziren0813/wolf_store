package com.wolf.mapper;

import com.wolf.pojo.wl_advertisement;

public interface wl_advertisementMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_advertisement record);

    int insertSelective(wl_advertisement record);

    wl_advertisement selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_advertisement record);

    int updateByPrimaryKey(wl_advertisement record);
}