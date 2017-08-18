package com.wolf.mapper;

import com.wolf.pojo.wl_proxy;

public interface wl_proxyMapper {
    int deleteByPrimaryKey(String userid);

    int insert(wl_proxy record);

    int insertSelective(wl_proxy record);

    wl_proxy selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(wl_proxy record);

    int updateByPrimaryKey(wl_proxy record);
}