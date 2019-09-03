package com.gch.yunpan.controller;

import com.gch.yunpan.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/login")
    public String login(String account){
        String result = userService.getByAccount(account);
        return result;
    }
}
