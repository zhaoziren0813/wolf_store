package com.wolf.mapper;

import com.wolf.pojo.wl_freight_discount;

public interface wl_freight_discountMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_freight_discount record);

    int insertSelective(wl_freight_discount record);

    wl_freight_discount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_freight_discount record);

    int updateByPrimaryKey(wl_freight_discount record);
}