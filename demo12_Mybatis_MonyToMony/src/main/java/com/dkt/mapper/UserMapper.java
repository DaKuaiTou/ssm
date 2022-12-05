package com.dkt.mapper;

import com.dkt.pojo.Account;
import com.dkt.pojo.User;

import java.util.List;

public interface UserMapper {
    // 查询用户信息以及对应的角色信息
    User findUserRoleListByUid(Integer uid);

    // 查询用户信息以及对应的账户信息和角色信息
}
