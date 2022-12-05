package com.dkt.mapper;

import com.dkt.pojo.Account;
import com.dkt.pojo.User;

import java.util.List;

public interface UserMapper {
    // 查询用户信息以及关联的账户信息
    User findUserAccountListByUid(Integer uid);
}
