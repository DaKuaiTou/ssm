package com.dkt.dao;

import com.dkt.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findUser();
}
