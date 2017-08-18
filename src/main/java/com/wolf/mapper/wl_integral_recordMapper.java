package com.wolf.mapper;

import com.wolf.pojo.wl_integral_record;

public interface wl_integral_recordMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_integral_record record);

    int insertSelective(wl_integral_record record);

    wl_integral_record selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_integral_record record);

    int updateByPrimaryKey(wl_integral_record record);
}