package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_brand_tag;

public interface wl_commodity_brand_tagMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_brand_tag record);

    int insertSelective(wl_commodity_brand_tag record);

    wl_commodity_brand_tag selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_brand_tag record);

    int updateByPrimaryKey(wl_commodity_brand_tag record);
}