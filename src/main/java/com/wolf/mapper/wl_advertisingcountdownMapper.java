package com.wolf.mapper;

import com.wolf.pojo.wl_advertisingcountdown;

public interface wl_advertisingcountdownMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_advertisingcountdown record);

    int insertSelective(wl_advertisingcountdown record);

    wl_advertisingcountdown selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_advertisingcountdown record);

    int updateByPrimaryKey(wl_advertisingcountdown record);
}