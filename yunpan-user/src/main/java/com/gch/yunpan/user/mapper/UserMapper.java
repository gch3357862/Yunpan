package com.gch.yunpan.user.mapper;

import com.gch.yunpan.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectByAccount(String account);

    List<User> selectByName(String name);

    int insert(User user);

    int updatePassword(User user);

    int updateName(User user);

    int delete(int id);

}
