package com.jk.service;

import com.jk.model.UserBean;

import java.util.Map;

public interface UserService {
    UserBean queryUserByUsernamePassword(UserBean user);

    Map<String, Object> queryUserList(Integer page, Integer limit, UserBean user);

    Integer deleteUserById(Integer userid);
}
