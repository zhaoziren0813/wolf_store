package com.wolf.mapper;

import com.wolf.pojo.wl_community_commodity;

public interface wl_community_commodityMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_community_commodity record);

    int insertSelective(wl_community_commodity record);

    wl_community_commodity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_community_commodity record);

    int updateByPrimaryKey(wl_community_commodity record);
}