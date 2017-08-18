package com.wolf.mapper;

import com.wolf.pojo.wl_user_competence;

public interface wl_user_competenceMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_competence record);

    int insertSelective(wl_user_competence record);

    wl_user_competence selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_competence record);

    int updateByPrimaryKey(wl_user_competence record);
}