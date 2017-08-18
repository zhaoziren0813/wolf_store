package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_comment;

public interface wl_commodity_commentMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_comment record);

    int insertSelective(wl_commodity_comment record);

    wl_commodity_comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_comment record);

    int updateByPrimaryKey(wl_commodity_comment record);
}