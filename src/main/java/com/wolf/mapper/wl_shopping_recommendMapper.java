package com.wolf.mapper;

import com.wolf.pojo.wl_shopping_recommend;

public interface wl_shopping_recommendMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_shopping_recommend record);

    int insertSelective(wl_shopping_recommend record);

    wl_shopping_recommend selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_shopping_recommend record);

    int updateByPrimaryKey(wl_shopping_recommend record);
}