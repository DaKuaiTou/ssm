package com.dkt.mapper;

import com.dkt.pojo.User;

import java.util.List;

public interface UserMapper {
    // 查询所有用户
    List<User> findAllUser();
    // 添加用户
    void addUser(User user);
    // 根据id查询用户
    User findUserById(Integer id);
    // 更新用户
    void updateUser(User user);
    // 删除用户
    void deleteUser(Integer id);
    // 模糊查询
    List<User> searchUserByName(String username);
}
