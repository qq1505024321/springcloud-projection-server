package com.jk.mapper;

import com.jk.model.HouseInfo_xc;
import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    UserBean queryUserByUsernamePassword(@Param("username") String username,@Param("userpwd") String userpwd);

    int queryUserFcount(@Param("user") UserBean user);

    List<UserBean> queryUserF(@Param("start") int start,@Param("limit") Integer limit,@Param("user") UserBean user);

    Long queryUserCount(@Param("user") UserBean user);

    List<UserBean> queryUserList(@Param("start") Integer start, @Param("limit") Integer limit, @Param("user") UserBean user);

    Integer deleteUserById(@Param("userid") Integer userid);

    long findHouseTotal();

    List<HouseInfo_xc> findFangjianById(@Param("start") Integer start,@Param("rows")  Integer limit);

    void updateStatus(@Param("num") Integer num,@Param("houseid") Integer houseid);
}
