package com.wolf.mapper;

import com.wolf.pojo.wl_recharge;

public interface wl_rechargeMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_recharge record);

    int insertSelective(wl_recharge record);

    wl_recharge selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_recharge record);

    int updateByPrimaryKey(wl_recharge record);
}