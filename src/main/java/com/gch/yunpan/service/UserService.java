package com.gch.yunpan.service;

import com.gch.yunpan.entity.User;

public interface UserService {

    String login(String account, String password);

    String getByName(String name);

    int insert(User user);

    int update(User user);

    int delete(int id);

}
