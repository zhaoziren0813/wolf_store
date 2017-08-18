package com.wolf.mapper;

import com.wolf.pojo.wl_user_login_log;

public interface wl_user_login_logMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_login_log record);

    int insertSelective(wl_user_login_log record);

    wl_user_login_log selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_login_log record);

    int updateByPrimaryKey(wl_user_login_log record);
}