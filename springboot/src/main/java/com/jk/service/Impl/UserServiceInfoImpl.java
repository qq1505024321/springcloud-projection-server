package com.jk.service.Impl;

import com.jk.mapper.UserInfoMapper;
import com.jk.model.UserInfo;
import com.jk.service.inter.UserInfoServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author 梁浩
 * @Date 2019/12/16
 * @Version V1.0
 **/
@Service
public class UserServiceInfoImpl implements UserInfoServiceInter {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo findUserById(Integer userid) {
        return userInfoMapper.findUserById(userid);
    }
}
