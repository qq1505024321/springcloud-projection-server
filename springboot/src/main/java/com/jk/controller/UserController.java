package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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
    /**
     * 查询房东名称，手机号，注册时间
     */
    @RequestMapping("queryUserF")
    @ResponseBody
    public Map<String,Object> queryUserF(Integer page,Integer limit,UserBean user){

        return userService.queryUserF(page,limit,user);
    }
}
