package com.wolf.mapper;

import com.wolf.pojo.wl_sys_configuration;

public interface wl_sys_configurationMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_sys_configuration record);

    int insertSelective(wl_sys_configuration record);

    wl_sys_configuration selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_sys_configuration record);

    int updateByPrimaryKeyWithBLOBs(wl_sys_configuration record);

    int updateByPrimaryKey(wl_sys_configuration record);
}