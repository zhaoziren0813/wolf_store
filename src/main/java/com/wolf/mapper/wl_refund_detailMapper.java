package com.wolf.mapper;

import com.wolf.pojo.wl_refund_detail;

public interface wl_refund_detailMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_refund_detail record);

    int insertSelective(wl_refund_detail record);

    wl_refund_detail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_refund_detail record);

    int updateByPrimaryKey(wl_refund_detail record);
}