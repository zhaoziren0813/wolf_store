package com.wolf.mapper;

import com.wolf.pojo.wl_sys_dictionary;

public interface wl_sys_dictionaryMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_sys_dictionary record);

    int insertSelective(wl_sys_dictionary record);

    wl_sys_dictionary selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_sys_dictionary record);

    int updateByPrimaryKey(wl_sys_dictionary record);
}