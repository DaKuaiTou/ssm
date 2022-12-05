package com.dkt;

import com.dkt.mapper.AccountMapper;
import com.dkt.mapper.UserMapper;
import com.dkt.pojo.Account;
import com.dkt.pojo.User;
import com.dkt.utils.SqlSessionFactionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author: dkt
 * @Pcakage: com.dkt.SqlSessionFactionTest
 * @Date: 2022年11月08日 22:05
 * @Description:
 */
public class SqlSessionFactionTest {
    // 根据id查询账户信息
    @Test
    public void findAccountByAid(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = mapper.findAccountByAid(7);
        System.out.println(account.getMoney() + "" + account.getUser().getUsername());
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 根据id查询用户信息
    @Test
    public void findUserByUid(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserByUid2(2);
        System.out.println(user);
        /*System.out.println("-----------------------------------------");
        System.out.println(user.getUsername()+"的账户"+user.getAccountList());*/
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

