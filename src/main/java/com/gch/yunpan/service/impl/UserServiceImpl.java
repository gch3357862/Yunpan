package com.gch.yunpan.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.gch.yunpan.entity.User;
import com.gch.yunpan.mapper.UserMapper;
import com.gch.yunpan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String login(String account, String password) {
        JSONObject result = new JSONObject();
        User user = userMapper.selectByAccount(account);
        if(user != null && user.getPassword().equals(password)){
            result.put("res", "success");
            result.put("data", user);
        }
        result.put("res", "fail");
        return JSONObject.toJSONString(result);
    }

    @Override
    public String getByName(String name) {
        JSONObject result = new JSONObject();
        List<User> list = userMapper.selectByName(name);
        result.put("data", list);
        result.put("total", list.size());
        return result.toJSONString();
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
