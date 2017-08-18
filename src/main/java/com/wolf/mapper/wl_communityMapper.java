package com.wolf.mapper;

import com.wolf.pojo.wl_community;

public interface wl_communityMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_community record);

    int insertSelective(wl_community record);

    wl_community selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_community record);

    int updateByPrimaryKeyWithBLOBs(wl_community record);

    int updateByPrimaryKey(wl_community record);
}