package com.dkt.mapper;

import com.dkt.pojo.Account;
import com.dkt.pojo.User;

import java.util.List;

public interface UserMapper {
    // 根据uid查询用户信息
    User findUserByUid(Integer uid);

    // 根据id查询用户信息
    User findUserByUid2(Integer uid);
}
