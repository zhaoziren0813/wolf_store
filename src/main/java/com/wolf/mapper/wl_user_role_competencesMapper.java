package com.wolf.mapper;

import com.wolf.pojo.wl_user_role_competences;

public interface wl_user_role_competencesMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_user_role_competences record);

    int insertSelective(wl_user_role_competences record);

    wl_user_role_competences selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_user_role_competences record);

    int updateByPrimaryKey(wl_user_role_competences record);
}