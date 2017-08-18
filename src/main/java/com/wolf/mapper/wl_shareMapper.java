package com.wolf.mapper;

import com.wolf.pojo.wl_share;
import com.wolf.pojo.wl_shareKey;

public interface wl_shareMapper {
    int deleteByPrimaryKey(wl_shareKey key);

    int insert(wl_share record);

    int insertSelective(wl_share record);

    wl_share selectByPrimaryKey(wl_shareKey key);

    int updateByPrimaryKeySelective(wl_share record);

    int updateByPrimaryKey(wl_share record);
}