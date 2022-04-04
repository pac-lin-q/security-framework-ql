package com.shiro.demo.ql.service;

import com.shiro.demo.ql.entity.UserInfo;

public interface UserService {

    UserInfo getUserInfo(String userId);

    boolean checkUserPWD(UserInfo user);
    
    void addUserInfo(UserInfo user);
}
