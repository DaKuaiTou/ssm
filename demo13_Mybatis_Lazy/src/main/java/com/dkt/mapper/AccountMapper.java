package com.dkt.mapper;

import com.dkt.pojo.Account;

import java.util.List;

public interface AccountMapper {
    // 根据账户id查询账户信息
    Account findAccountByAid(Integer aid);

    // 根据uid查询账户信息
    List<Account> findAccountByUid(Integer uid);
}
