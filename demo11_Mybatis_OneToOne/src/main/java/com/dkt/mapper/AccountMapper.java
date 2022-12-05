package com.dkt.mapper;

import com.dkt.pojo.Account;

public interface AccountMapper {
    // 根据aid查询账户信息，并且连接上user用户表查询该账户所属的用户信息
    Account findAccountUserByAid(Integer aid);
}
