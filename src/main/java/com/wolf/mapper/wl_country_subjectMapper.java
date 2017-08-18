package com.wolf.mapper;

import com.wolf.pojo.wl_country_subject;
import com.wolf.pojo.wl_country_subjectWithBLOBs;

public interface wl_country_subjectMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_country_subjectWithBLOBs record);

    int insertSelective(wl_country_subjectWithBLOBs record);

    wl_country_subjectWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_country_subjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(wl_country_subjectWithBLOBs record);

    int updateByPrimaryKey(wl_country_subject record);
}