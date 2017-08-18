package com.wolf.mapper;

import com.wolf.pojo.wl_logistics;

public interface wl_logisticsMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_logistics record);

    int insertSelective(wl_logistics record);

    wl_logistics selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_logistics record);

    int updateByPrimaryKey(wl_logistics record);
}