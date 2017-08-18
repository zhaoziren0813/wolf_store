package com.wolf.mapper;

import com.wolf.pojo.wl_user_interest;

public interface wl_user_interestMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_interest record);

    int insertSelective(wl_user_interest record);

    wl_user_interest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_interest record);

    int updateByPrimaryKey(wl_user_interest record);
}