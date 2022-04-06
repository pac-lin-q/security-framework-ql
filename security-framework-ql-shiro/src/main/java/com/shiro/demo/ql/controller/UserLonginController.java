package com.shiro.demo.ql.controller;

import com.shiro.demo.ql.constants.CommConstants;
import com.shiro.demo.ql.entity.UserInfo;
import com.shiro.demo.ql.service.UserService;
import com.shiro.demo.ql.utils.EncodingUserPwd;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class UserLonginController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/login")
    public String login(){
        log.info("login must!");
        return "/login";
    }


    @PostMapping(value = "/login")
    public String goLogin(UserInfo userInfo) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userInfo.getUserTel(), EncodingUserPwd.encryptEcb(CommConstants.SM_KEY,userInfo.getUserPwd()));
        try {
            subject.login(usernamePasswordToken);
        } catch (UnknownAccountException e) {
            log.error("用户名不存在！", e);
            return "用户名不存在！";
        } catch (AuthenticationException e) {
            log.error("账号或密码错误！", e);
            return "账号或密码错误！";
        } catch (AuthorizationException e) {
            log.error("没有权限！", e);
            return "没有权限";
        }

//        boolean bool = userService.checkUserPWD(userInfo.getUserPwd(),userInfo.getUserTel());
        return "/index";
    }
}
