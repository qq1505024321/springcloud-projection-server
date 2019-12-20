package com.jk.mapper;

import com.jk.model.Houseinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {
    int queryHouseCount(@Param("houseinfo") Houseinfo houseinfo);

    List<Houseinfo> queryHouseInfo(@Param("start") int start,@Param("limit") Integer limit,@Param("houseinfo") Houseinfo houseinfo);
}
