package com.wolf.mapper;

import com.wolf.pojo.wl_pay_user;
import com.wolf.pojo.wl_pay_userKey;

public interface wl_pay_userMapper {
    int deleteByPrimaryKey(wl_pay_userKey key);

    int insert(wl_pay_user record);

    int insertSelective(wl_pay_user record);

    wl_pay_user selectByPrimaryKey(wl_pay_userKey key);

    int updateByPrimaryKeySelective(wl_pay_user record);

    int updateByPrimaryKey(wl_pay_user record);
}