package com.wolf.mapper;

import com.wolf.pojo.wl_subject;

public interface wl_subjectMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_subject record);

    int insertSelective(wl_subject record);

    wl_subject selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_subject record);

    int updateByPrimaryKey(wl_subject record);
}