package com.shiro.demo.ql.service;

import com.shiro.demo.ql.entity.UserInfo;

public interface UserService {

    UserInfo getUserInfo(String userId);

    boolean checkUserPWD(String userPwd,String userTel);
    
    void addUserInfo(UserInfo user);
}
