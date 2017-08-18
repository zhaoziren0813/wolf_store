package com.wolf.mapper;

import com.wolf.pojo.wl_activity_lucky_prize;

public interface wl_activity_lucky_prizeMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_activity_lucky_prize record);

    int insertSelective(wl_activity_lucky_prize record);

    wl_activity_lucky_prize selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_activity_lucky_prize record);

    int updateByPrimaryKey(wl_activity_lucky_prize record);
}