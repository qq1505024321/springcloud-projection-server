package com.jk.controller;


import com.alibaba.fastjson.JSONObject;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller_xc {

    @Autowired
    private UserService userService;


    @RequestMapping("findShenHeInfo")
    @ResponseBody
    public JSONObject findFangjianById(Integer page, Integer limit){
        JSONObject json = userService.findFangjianById(page,limit);
        long code = 0;
        String msg = "";
        json.put("code",code);
        json.put("msg",msg);
        return json;
    }

    @RequestMapping("updateStatus")
    @ResponseBody
    public void updateStatus(Integer num,Integer houseid){
        userService.updateStatus(num,houseid);
    }
}
