package com.gch.yunpan.service.impl;

import com.gch.yunpan.entity.User;
import com.gch.yunpan.mapper.UserMapper;
import com.gch.yunpan.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getByAccount(String account) {
        User user = userMapper.selectByAccount(account);
        return JSONObject.fromObject(user).toString();
    }

    @Override
    public String getByName(String name) {
        return null;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

}
