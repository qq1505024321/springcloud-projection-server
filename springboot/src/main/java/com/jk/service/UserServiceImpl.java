package com.jk.service;

import com.jk.mapper.UserMapper;
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
}
