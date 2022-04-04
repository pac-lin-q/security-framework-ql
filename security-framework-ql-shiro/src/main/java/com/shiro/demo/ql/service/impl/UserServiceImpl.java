package com.shiro.demo.ql.service.impl;

import com.shiro.demo.ql.dao.UserInfoDao;
import com.shiro.demo.ql.entity.UserInfo;
import com.shiro.demo.ql.service.UserService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfo(String userId) {
        return userInfoDao.findUserInfosByUserTel(userId);
    }

    @Override
    public boolean checkUserPWD(String userPwd,String userTel) {
        UserInfo userInfo = userInfoDao.findUserInfoByUserPwdAndUserTel(userPwd,userTel);
        if (userInfo != null){
            return true;
        }
        return false;
    }

    @Override
    public void addUserInfo(UserInfo user) {

    }
}
