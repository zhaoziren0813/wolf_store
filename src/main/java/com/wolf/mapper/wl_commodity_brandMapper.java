package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_brand;

public interface wl_commodity_brandMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_brand record);

    int insertSelective(wl_commodity_brand record);

    wl_commodity_brand selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_brand record);

    int updateByPrimaryKey(wl_commodity_brand record);
}