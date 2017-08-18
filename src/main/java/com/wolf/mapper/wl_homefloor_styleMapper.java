package com.wolf.mapper;

import com.wolf.pojo.wl_homefloor_style;

public interface wl_homefloor_styleMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_homefloor_style record);

    int insertSelective(wl_homefloor_style record);

    wl_homefloor_style selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_homefloor_style record);

    int updateByPrimaryKeyWithBLOBs(wl_homefloor_style record);

    int updateByPrimaryKey(wl_homefloor_style record);
}