package com.gch.yunpan.mapper;

import com.gch.yunpan.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectByAccount(String account);

    List<User> selectByName(String name);

    int insert(User user);

    int update(User user);

    int delete(int id);

}
