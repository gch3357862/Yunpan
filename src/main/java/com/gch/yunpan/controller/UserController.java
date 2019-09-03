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
    public String login(String account, String password){
        return userService.login(account, password);
    }

    @GetMapping("/user/findByName")
    public String findByName(String name){
        return userService.getByName(name);
    }

}
