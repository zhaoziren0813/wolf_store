package com.wolf.mapper;

import com.wolf.pojo.wl_luckdraw;

public interface wl_luckdrawMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_luckdraw record);

    int insertSelective(wl_luckdraw record);

    wl_luckdraw selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_luckdraw record);

    int updateByPrimaryKey(wl_luckdraw record);
}