package com.wolf.mapper;

import com.wolf.pojo.wl_banner;

public interface wl_bannerMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_banner record);

    int insertSelective(wl_banner record);

    wl_banner selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_banner record);

    int updateByPrimaryKey(wl_banner record);
}