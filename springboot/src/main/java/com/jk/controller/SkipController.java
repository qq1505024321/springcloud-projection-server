package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SkipController
 * @Description: TODO
 * @Author 梁浩
 * @Date 2019/12/16
 * @Version V1.0
 **/
@Controller

public class SkipController {


    @RequestMapping("toShowUser")
    public String toShowUser(){
        return "showUser";
    }
}
