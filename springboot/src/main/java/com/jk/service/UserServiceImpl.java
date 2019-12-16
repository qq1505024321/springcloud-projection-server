package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
