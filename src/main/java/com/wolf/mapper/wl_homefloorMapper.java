package com.wolf.mapper;

import com.wolf.pojo.wl_homefloor;

public interface wl_homefloorMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_homefloor record);

    int insertSelective(wl_homefloor record);

    wl_homefloor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_homefloor record);

    int updateByPrimaryKey(wl_homefloor record);
}