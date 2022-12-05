package com.dkt.service;

import com.dkt.mapper.UserMapper;
import com.dkt.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findUser();
    User findUserById(Integer id);
    void addUser(User user);
    void deleteUser(Integer id);
    void updateUser(User user);
}
