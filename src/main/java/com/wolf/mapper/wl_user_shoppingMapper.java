package com.wolf.mapper;

import com.wolf.pojo.wl_user_shopping;
import com.wolf.pojo.wl_user_shoppingKey;

public interface wl_user_shoppingMapper {
    int deleteByPrimaryKey(wl_user_shoppingKey key);

    int insert(wl_user_shopping record);

    int insertSelective(wl_user_shopping record);

    wl_user_shopping selectByPrimaryKey(wl_user_shoppingKey key);

    int updateByPrimaryKeySelective(wl_user_shopping record);

    int updateByPrimaryKey(wl_user_shopping record);
}