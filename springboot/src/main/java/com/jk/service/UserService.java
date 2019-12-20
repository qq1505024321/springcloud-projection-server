package com.jk.service;

import com.jk.model.UserBean;

import java.util.Map;

public interface UserService {
    UserBean queryUserByUsernamePassword(UserBean user);

    Map<String, Object> queryUserF(Integer page, Integer limit, UserBean user);
}
