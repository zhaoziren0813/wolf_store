package com.wolf.mapper;

import com.wolf.pojo.wl_push_message_template;

public interface wl_push_message_templateMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_push_message_template record);

    int insertSelective(wl_push_message_template record);

    wl_push_message_template selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_push_message_template record);

    int updateByPrimaryKeyWithBLOBs(wl_push_message_template record);

    int updateByPrimaryKey(wl_push_message_template record);
}