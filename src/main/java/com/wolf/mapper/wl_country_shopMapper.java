package com.wolf.mapper;

import com.wolf.pojo.wl_country_shop;

public interface wl_country_shopMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_country_shop record);

    int insertSelective(wl_country_shop record);

    wl_country_shop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_country_shop record);

    int updateByPrimaryKey(wl_country_shop record);
}