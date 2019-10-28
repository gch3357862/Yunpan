package com.gch.yunpan.user.controller;

import com.gch.yunpan.user.entity.User;
import com.gch.yunpan.user.service.UserService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@CrossOrigin
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/login")
    public String login(String account, String password) {
        return userService.login(account, password);
    }

    @GetMapping("/user/find")
    public String findByName(String name) {
        return userService.getByName(name);
    }

    @PostMapping("/user/add")
    public String add(User user) {
        return userService.add(user);
    }

    @PostMapping("/user/updatePassword")
    public String updatePassword(User user) {
        return userService.updatePassword(user);
    }

    @PostMapping("/user/updateName")
    public String updateName(User user) {
        return userService.updateName(user);
    }

    @PostMapping("/user/delete")
    public String delete(int id) {
        return userService.delete(id);
    }

}
