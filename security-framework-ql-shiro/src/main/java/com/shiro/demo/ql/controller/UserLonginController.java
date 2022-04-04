package com.shiro.demo.ql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLonginController {

    @RequestMapping(value = "/login")
    public String goLogin(String userid){
        return "";
    }
}
