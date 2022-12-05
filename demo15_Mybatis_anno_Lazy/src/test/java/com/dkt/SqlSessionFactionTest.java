package com.dkt;

import com.dkt.mapper.AccountMapper;
import com.dkt.mapper.UserMapper;
import com.dkt.pojo.Account;
import com.dkt.pojo.User;
import com.dkt.utils.SqlSessionFactionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.management.relation.Role;
import java.util.*;

/**
 * @author: dkt
 * @Pcakage: com.dkt.SqlSessionFactionTest
 * @Date: 2022年11月08日 22:05
 * @Description:
 */
public class SqlSessionFactionTest {
    /*
    *   根据id查询账户信息并关联用户信息
    * */
    @Test
    public void findAccountUserByAid(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = mapper.findAccountUserByAid(8);
        System.out.println(account.getMoney());
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    /*
    *   根据id查询用户信息并关联账户信息
    * */
    @Test
    public void findUserAccountList(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserByUid2(2);
        System.out.println(user.getUsername());
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

