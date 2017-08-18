package com.wolf.mapper;

import com.wolf.pojo.wl_city;

public interface wl_cityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(wl_city record);

    int insertSelective(wl_city record);

    wl_city selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(wl_city record);

    int updateByPrimaryKey(wl_city record);
}