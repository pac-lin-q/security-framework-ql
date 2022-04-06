package com.shiro.demo.ql.dao;

import com.shiro.demo.ql.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo,Long> {

    UserInfo findUserInfosByUserTel(String userTel);

    UserInfo findUserInfoByUserPwdAndUserTel(String userPwd,String userTel);

//    UserInfo findUserInfo(UserInfo userInfo);
}
