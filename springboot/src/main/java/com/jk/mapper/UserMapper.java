package com.jk.mapper;

import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserBean queryUserByUsernamePassword(@Param("username") String username,@Param("userpwd") String userpwd);
}
