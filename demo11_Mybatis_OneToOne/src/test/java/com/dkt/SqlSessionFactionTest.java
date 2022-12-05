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
    // 查询账户以及对应用户的信息        一对一
    @Test
    public void findAccountUserByAid(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        mapper.findAccountUserByAid(7);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 查询用户以及对应账户信息     一对多
    @Test
    public void findUserAccountListByUid(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserAccountListByUid(2);
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

