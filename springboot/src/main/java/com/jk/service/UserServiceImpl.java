package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.UserMapper;
import com.jk.model.HouseInfo_xc;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean queryUserByUsernamePassword(UserBean user) {

        String username = user.getUsername();
        String userpwd = user.getUserpwd();
        return userMapper.queryUserByUsernamePassword(username,userpwd);
    }

    @Override
    public Map<String, Object> queryUserList(Integer page, Integer limit, UserBean user) {

        Long total = userMapper.queryUserCount(user);

        Integer start = (page-1)*limit;

        List<UserBean> userBeanList = userMapper.queryUserList(start,limit,user);

        HashMap<String,Object> map = new HashMap<String,Object>();

        map.put("count",total);

        map.put("msg","");

        map.put("code",0);

        map.put("data",userBeanList);

        return map;
    }

    @Override
    public Integer deleteUserById(Integer userid) {
        return userMapper.deleteUserById(userid);
    }

    @Override
    public JSONObject findFangjianById(Integer page, Integer limit) {
        long total = userMapper.findHouseTotal();
        Integer start = (page-1)*limit;
        List<HouseInfo_xc> usersList = userMapper.findFangjianById(start,limit);
        JSONObject json = new JSONObject();
        json.put("count",total);
        json.put("data",usersList);
        return json;
    }

    @Override
    public void updateStatus(Integer num,Integer houseid) {
        userMapper.updateStatus(num,houseid);
    }

    @Override
    public Map<String, Object> queryUserF(Integer page, Integer limit, UserBean user) {

        HashMap<String, Object> map = new HashMap<>();

        int count=userMapper.queryUserFcount(user);

        int start=(page-1)*limit;

        List<UserBean> list=userMapper.queryUserF(start,limit,user);

        map.put("count",count);
        map.put("code",0);
        map.put("msg","");
        map.put("data",list);

        return map;
    }
}
