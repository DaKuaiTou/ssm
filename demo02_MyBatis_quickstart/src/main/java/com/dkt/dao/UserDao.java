package com.dkt.dao;

import com.dkt.pojo.User;

import java.util.List;
/*
*   持久层接口
* */
public interface UserDao {
    // 查询所有用户信息，返回所有用户列表数据
    List<User> findAllUser();
}
