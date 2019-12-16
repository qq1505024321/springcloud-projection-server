package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("tologin")
    public String tologin(){

        return "login";
    }

    @RequestMapping("tomain")
    public String tomain(){

        return "main";
    }
}
