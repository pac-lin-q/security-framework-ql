package com.shiro.demo.ql.controller;

import com.shiro.demo.ql.entity.UserInfo;
import com.shiro.demo.ql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLonginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String goLogin(String userPwd,String userTel){
        boolean bool = userService.checkUserPWD(userPwd,userTel);
        return bool?"get":"err";
    }
}
