package com.jk.service;

import com.jk.model.Houseinfo;

import java.util.List;
import java.util.Map;

public interface HouseSevice {
    Map<String, Object> queryHouseInfo(Integer page, Integer limit, Houseinfo houseinfo);

    List<Houseinfo> queryHouseInfo1();

}
