package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_brand_tag_rel;

public interface wl_commodity_brand_tag_relMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_brand_tag_rel record);

    int insertSelective(wl_commodity_brand_tag_rel record);

    wl_commodity_brand_tag_rel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_brand_tag_rel record);

    int updateByPrimaryKey(wl_commodity_brand_tag_rel record);
}