package com.dkt.dao;

import com.dkt.pojo.User;

/**
 * @author: dkt
 * @Pcakage: com.dkt.dao.UserDao
 * @Date: 2022年12月09日 11:48
 * @Description:
 */
public interface UserDao {
    User findUserById(Integer id);
    User findUserByName(String username);
    void updateUser(User user);
}
