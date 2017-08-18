package com.wolf.mapper;

import com.wolf.pojo.wl_qrscene;

public interface wl_qrsceneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(wl_qrscene record);

    int insertSelective(wl_qrscene record);

    wl_qrscene selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(wl_qrscene record);

    int updateByPrimaryKey(wl_qrscene record);
}