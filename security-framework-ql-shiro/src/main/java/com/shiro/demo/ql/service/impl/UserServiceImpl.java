package com.shiro.demo.ql.service.impl;

import com.shiro.demo.ql.entity.UserInfo;
import com.shiro.demo.ql.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public UserInfo getUserInfo(String userId) {
        return null;
    }

    @Override
    public boolean checkUserPWD(UserInfo user) {
        return false;
    }

    @Override
    public void addUserInfo(UserInfo user) {

    }
}
