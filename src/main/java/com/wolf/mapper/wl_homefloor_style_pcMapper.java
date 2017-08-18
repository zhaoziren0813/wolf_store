package com.wolf.mapper;

import com.wolf.pojo.wl_homefloor_style_pc;

public interface wl_homefloor_style_pcMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_homefloor_style_pc record);

    int insertSelective(wl_homefloor_style_pc record);

    wl_homefloor_style_pc selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_homefloor_style_pc record);

    int updateByPrimaryKey(wl_homefloor_style_pc record);
}