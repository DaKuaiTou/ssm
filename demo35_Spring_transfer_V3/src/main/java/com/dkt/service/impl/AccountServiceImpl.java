package com.dkt.service.impl;

import com.dkt.mapper.AccountMapper;
import com.dkt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.AccountServiceImpl
 * @Date: 2022年12月18日 20:03
 * @Description:
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional
    public void transfer(String formName, String toName, Double money) {
        // 进行事务的相关转账操作
        accountMapper.updateAccount(formName, -money);
        int i = 1/0;
        accountMapper.updateAccount(toName, +money);
    }
}
