package com.shiro.demo.ql.controller;

import com.shiro.demo.ql.entity.UserInfo;
import com.shiro.demo.ql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserLonginController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/login")
    public String login(){
        return "/login";
    }


    @PostMapping(value = "/login")
    public String goLogin(@RequestParam("userPwd") String userPwd, @RequestParam("userTel") String userTel){
        boolean bool = userService.checkUserPWD(userPwd,userTel);
        return bool?"get":"err";
    }
}
