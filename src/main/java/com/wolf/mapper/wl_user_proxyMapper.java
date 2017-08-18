package com.wolf.mapper;

import com.wolf.pojo.wl_user_proxy;

public interface wl_user_proxyMapper {
    int deleteByPrimaryKey(String userid);

    int insert(wl_user_proxy record);

    int insertSelective(wl_user_proxy record);

    wl_user_proxy selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(wl_user_proxy record);

    int updateByPrimaryKey(wl_user_proxy record);
}