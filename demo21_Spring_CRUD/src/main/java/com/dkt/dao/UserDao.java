package com.dkt.dao;

import com.dkt.pojo.User;

import java.sql.SQLException;

public interface UserDao {
    /*
    *   根据id查询用户
    * */
    User findUserById(Integer id) throws SQLException;

    /*
    *   根据id删除用户
    * */
    void deleteUserById(Integer id) throws SQLException;

    /*
    *   修改用户信息
    * */
    void updateUser(User user) throws SQLException;

    /*
    *   添加用户
    * */
    void addUser(User user) throws SQLException;
}
