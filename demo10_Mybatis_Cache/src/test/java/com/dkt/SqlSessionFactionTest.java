package com.dkt;

import com.dkt.mapper.UserMapper;
import com.dkt.pojo.QueryUser;
import com.dkt.pojo.User;
import com.dkt.pojo.UserInfo;
import com.dkt.utils.SqlSessionFactionUtil;
import org.apache.ibatis.annotations.Param;
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

    // 查询所有用户
    @Test
    public void findAllUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList1 = mapper.findAllUser();

        // 执行一次添加用户，
        User user = getUser();
        mapper.addUser(user);

        List<User> userList2 = mapper.findAllUser();
        printList(userList1);
        System.out.println("==================================================");
        printList(userList2);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    @Test
    public void findALlUser2(){
        SqlSession sqlSession1 = SqlSessionFactionUtil.getSqlSession();
        SqlSession sqlSession2 = SqlSessionFactionUtil.getSqlSession();
        SqlSession sqlSession3 = SqlSessionFactionUtil.getSqlSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession3.getMapper(UserMapper.class);

        List<User> userList1 = mapper1.findAllUser();
        sqlSession1.close();
        User user = getUser();
        mapper2.addUser(user);
        List<User> userList3 = mapper3.findAllUser();

        printList(userList1);
        printList(userList3);
    }

    public User getUser(){
        User user = new User();
        user.setUsername("王五");
        user.setPassword("wangwu123");
        user.setNickname("小王");
        return user;
    }

    public void printList(List<User> list){
        for (User user : list) {
            System.out.println(user);
        }
    }
}

