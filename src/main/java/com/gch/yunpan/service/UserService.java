package com.gch.yunpan.service;

import com.gch.yunpan.entity.User;

public interface UserService {

    String login(String account, String password);

    String getByName(String name);

    String add(User user);

    String updatePassword(User user);

    String updateName(User user);

    String delete(int id);

}
