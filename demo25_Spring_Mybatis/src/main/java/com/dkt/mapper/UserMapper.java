package com.dkt.mapper;

import com.dkt.pojo.User;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.mapper.UserMapper
 * @Date: 2022年12月02日 15:13
 * @Description:
 */
public interface UserMapper {
    List<User> findUser();
    User findUserById(Integer id);
    void addUser(User user);
    void deleteUser(Integer id);
    void updateUser(User user);
}
