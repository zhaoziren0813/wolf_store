package com.wolf.mapper;

import com.wolf.pojo.wl_category;

public interface wl_categoryMapper {
    int deleteByPrimaryKey(String cateid);

    int insert(wl_category record);

    int insertSelective(wl_category record);

    wl_category selectByPrimaryKey(String cateid);

    int updateByPrimaryKeySelective(wl_category record);

    int updateByPrimaryKey(wl_category record);
}