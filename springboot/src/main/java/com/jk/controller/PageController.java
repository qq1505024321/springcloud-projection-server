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

    @RequestMapping("tohouse")
    public String tohouse(){

        return "house";
    }

    @RequestMapping("toposter")
    public String toposter(){

        return "poster";
    }

    @RequestMapping("toposterShow")
    public String toposterShow(){

        return "posterShow";
    }
}
