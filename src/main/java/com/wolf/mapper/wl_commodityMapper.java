package com.wolf.mapper;

import com.wolf.pojo.wl_commodity;
import com.wolf.pojo.wl_commodityWithBLOBs;

public interface wl_commodityMapper {
    int deleteByPrimaryKey(String id);

    int insert(wl_commodityWithBLOBs record);

    int insertSelective(wl_commodityWithBLOBs record);

    wl_commodityWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(wl_commodityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(wl_commodityWithBLOBs record);

    int updateByPrimaryKey(wl_commodity record);
}