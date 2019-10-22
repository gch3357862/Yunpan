package com.gch.yunpan.user.service.impl;

import com.gch.yunpan.user.entity.User;
import com.gch.yunpan.user.mapper.UserMapper;
import com.gch.yunpan.user.service.UserService;
import com.gch.yunpan.common.utils.JsonUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String login(String account, String password) {
        User user = userMapper.selectByAccount(account);
        if(user == null ) {
            return JsonUtil.createFailResponse("Wrong Account.");
        } else if(!user.getPassword().equals(password)) {
            return JsonUtil.createFailResponse("Wrong Password.");
        } else {
            return JsonUtil.createSuccessResponse(user);
        }
    }

    @Override
    public String getByName(String name) {
        List<User> list = userMapper.selectByName(name);
        return JsonUtil.createSuccessResponse(list);
    }

    @Override
    public String add(User user) {
        int count = userMapper.insert(user);
        if(count > 0){
            return JsonUtil.createSuccessResponse();
        }
        else{
            return JsonUtil.createFailResponse("Unknown Error.Failed to add user.");
        }
    }

    @Override
    public String updatePassword(User user) {
        int count = userMapper.updatePassword(user);
        if(count > 0){
            return JsonUtil.createSuccessResponse();
        }
        else{
            return JsonUtil.createFailResponse("Unknown Error.Failed to update password.");
        }
    }

    @Override
    public String updateName(User user) {
        int count = userMapper.updateName(user);
        if(count > 0) {
            return JsonUtil.createSuccessResponse();
        }
        else {
            return JsonUtil.createFailResponse("Unknown Error.Failed to update name.");
        }
    }

    @Override
    public String delete(int id) {
        int count = userMapper.delete(id);
        if(count > 0) {
            return JsonUtil.createSuccessResponse();
        }
        else {
            return JsonUtil.createFailResponse("Error.User is already deleted.");
        }
    }

}
