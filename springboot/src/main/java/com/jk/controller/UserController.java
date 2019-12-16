package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*登录
    *
    * */
    @RequestMapping("queryUser")
    @ResponseBody
    public String queryUser(UserBean user, HttpServletRequest request){

        UserBean userBean=userService.queryUserByUsernamePassword(user);

        if(userBean==null){
            return "fail";
        }
        request.getSession().setAttribute("user",userBean);

        return "success";
    }
}
