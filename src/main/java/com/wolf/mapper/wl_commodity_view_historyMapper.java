package com.wolf.mapper;

import com.wolf.pojo.wl_commodity_view_history;

public interface wl_commodity_view_historyMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodity_view_history record);

    int insertSelective(wl_commodity_view_history record);

    wl_commodity_view_history selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodity_view_history record);

    int updateByPrimaryKey(wl_commodity_view_history record);
}