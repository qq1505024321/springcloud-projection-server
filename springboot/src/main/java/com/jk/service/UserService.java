package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.UserBean;

import java.util.Map;

public interface UserService {
    UserBean queryUserByUsernamePassword(UserBean user);

    Map<String, Object> queryUserF(Integer page, Integer limit, UserBean user);

    Map<String, Object> queryUserList(Integer page, Integer limit, UserBean user);

    Integer deleteUserById(Integer userid);

    JSONObject findFangjianById(Integer page, Integer limit);

    void updateStatus(Integer num,Integer houseid);
}
