package com.wolf.mapper;

import com.wolf.pojo.wl_community_comment;

public interface wl_community_commentMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_community_comment record);

    int insertSelective(wl_community_comment record);

    wl_community_comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_community_comment record);

    int updateByPrimaryKey(wl_community_comment record);
}