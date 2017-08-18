package com.wolf.mapper;

import com.wolf.pojo.wl_sys_dict;

public interface wl_sys_dictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(wl_sys_dict record);

    int insertSelective(wl_sys_dict record);

    wl_sys_dict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(wl_sys_dict record);

    int updateByPrimaryKey(wl_sys_dict record);
}