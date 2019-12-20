package com.jk.service;

import com.jk.mapper.HouseMapper;
import com.jk.model.Houseinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HouseServiceImpl implements HouseSevice{

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public Map<String, Object> queryHouseInfo(Integer page, Integer limit, Houseinfo houseinfo) {

        HashMap<String, Object> map = new HashMap<>();

        int count=houseMapper.queryHouseCount(houseinfo);

        int start=(page-1)*limit;

        List<Houseinfo> list=houseMapper.queryHouseInfo(start,limit,houseinfo);

        map.put("count",count);
        map.put("code",0);
        map.put("msg","");
        map.put("data",list);

        return map;
    }
}
