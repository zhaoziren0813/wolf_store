package com.wolf.mapper;

import com.wolf.pojo.wl_banner_pc;

public interface wl_banner_pcMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_banner_pc record);

    int insertSelective(wl_banner_pc record);

    wl_banner_pc selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_banner_pc record);

    int updateByPrimaryKey(wl_banner_pc record);
}