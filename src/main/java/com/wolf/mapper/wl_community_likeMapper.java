package com.wolf.mapper;

import com.wolf.pojo.wl_community_like;

public interface wl_community_likeMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_community_like record);

    int insertSelective(wl_community_like record);

    wl_community_like selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_community_like record);

    int updateByPrimaryKey(wl_community_like record);
}