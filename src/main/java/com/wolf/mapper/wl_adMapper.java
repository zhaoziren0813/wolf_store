package com.wolf.mapper;

import com.wolf.pojo.wl_ad;

public interface wl_adMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_ad record);

    int insertSelective(wl_ad record);

    wl_ad selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_ad record);

    int updateByPrimaryKey(wl_ad record);
}