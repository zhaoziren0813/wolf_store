package com.wolf.mapper;

import com.wolf.pojo.wl_push_message;

public interface wl_push_messageMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_push_message record);

    int insertSelective(wl_push_message record);

    wl_push_message selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_push_message record);

    int updateByPrimaryKeyWithBLOBs(wl_push_message record);

    int updateByPrimaryKey(wl_push_message record);
}