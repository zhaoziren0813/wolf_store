package com.wolf.mapper;

import com.wolf.pojo.wl_article;

public interface wl_articleMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_article record);

    int insertSelective(wl_article record);

    wl_article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_article record);

    int updateByPrimaryKeyWithBLOBs(wl_article record);

    int updateByPrimaryKey(wl_article record);
}