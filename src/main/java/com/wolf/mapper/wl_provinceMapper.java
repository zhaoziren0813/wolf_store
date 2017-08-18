package com.wolf.mapper;

import com.wolf.pojo.wl_province;

public interface wl_provinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(wl_province record);

    int insertSelective(wl_province record);

    wl_province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(wl_province record);

    int updateByPrimaryKey(wl_province record);
}