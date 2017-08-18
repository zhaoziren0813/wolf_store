package com.wolf.mapper;

import com.wolf.pojo.wl_wechat_message;

public interface wl_wechat_messageMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_wechat_message record);

    int insertSelective(wl_wechat_message record);

    wl_wechat_message selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_wechat_message record);

    int updateByPrimaryKey(wl_wechat_message record);
}