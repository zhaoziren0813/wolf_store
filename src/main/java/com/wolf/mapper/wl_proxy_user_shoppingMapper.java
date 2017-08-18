package com.wolf.mapper;

import com.wolf.pojo.wl_proxy_user_shopping;

public interface wl_proxy_user_shoppingMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_proxy_user_shopping record);

    int insertSelective(wl_proxy_user_shopping record);

    wl_proxy_user_shopping selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_proxy_user_shopping record);

    int updateByPrimaryKey(wl_proxy_user_shopping record);
}