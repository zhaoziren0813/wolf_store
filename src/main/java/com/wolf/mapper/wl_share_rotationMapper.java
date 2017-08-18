package com.wolf.mapper;

import com.wolf.pojo.wl_share_rotation;

public interface wl_share_rotationMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_share_rotation record);

    int insertSelective(wl_share_rotation record);

    wl_share_rotation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_share_rotation record);

    int updateByPrimaryKey(wl_share_rotation record);
}