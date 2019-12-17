package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.model.UserInfo;
import com.jk.service.UserService;
import com.jk.service.inter.UserInfoServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserInfoServiceInter userInfoService;

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
     * 查询  分页 条件查询
     * @param page
     * @param limit
     * @param user
     * @return
     */
    @RequestMapping("queryUserList")
    @ResponseBody
    public Map<String,Object> queryUserList(Integer page,Integer limit,UserBean user){
        System.out.println(user.getStarttime()+"-----"+user.getEndtime()+"----"+user.getUsername());
        return userService.queryUserList(page,limit,user);
    }


    /**
     * 删除
     * @param userid
     * @return
     */
    @RequestMapping("deleteUserById")
    @ResponseBody
    public Integer deleteUserById(Integer userid){
        Integer msg = userService.deleteUserById(userid);
        if(msg == 1){
            return msg;
        }else {
            return 2;
        }
    }

    /*详细信息展示*/
    @RequestMapping("findUserById")
    @ResponseBody
    public UserInfo findUserById(Integer userid, HttpSession session){
        UserInfo userinfo = userInfoService.findUserById(userid);
        System.out.println(userinfo);
        return userinfo;
    }
}
