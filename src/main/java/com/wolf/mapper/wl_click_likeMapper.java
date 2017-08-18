package com.wolf.mapper;

import com.wolf.pojo.wl_click_like;
import com.wolf.pojo.wl_click_likeKey;

public interface wl_click_likeMapper {
    int deleteByPrimaryKey(wl_click_likeKey key);

    int insert(wl_click_like record);

    int insertSelective(wl_click_like record);

    wl_click_like selectByPrimaryKey(wl_click_likeKey key);

    int updateByPrimaryKeySelective(wl_click_like record);

    int updateByPrimaryKey(wl_click_like record);
}