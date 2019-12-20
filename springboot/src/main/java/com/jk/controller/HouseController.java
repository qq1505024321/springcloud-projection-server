package com.jk.controller;

import com.jk.model.Houseinfo;
import com.jk.service.HouseSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HouseController {

    @Autowired
    private HouseSevice houseSevice;

    @RequestMapping("queryHouseInfo")
    @ResponseBody
    public Map<String,Object> queryHouseInfo(Integer page, Integer limit, Houseinfo houseinfo){

        return houseSevice.queryHouseInfo(page,limit,houseinfo);
    }
}
