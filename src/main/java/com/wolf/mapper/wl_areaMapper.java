package com.wolf.mapper;

import com.wolf.pojo.wl_area;

public interface wl_areaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(wl_area record);

    int insertSelective(wl_area record);

    wl_area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(wl_area record);

    int updateByPrimaryKey(wl_area record);
}