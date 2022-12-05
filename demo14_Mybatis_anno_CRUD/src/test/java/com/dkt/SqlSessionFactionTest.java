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
    /*
    *   新增用户
    * */
    @Test
    public void addUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张三");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("西安");
        mapper.addUser(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    /*
    *   删除用户
    * */
    @Test
    public void deleteUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(14);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    /*
    *   更改用户
    * */
    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUser(12);
        user.setUsername("沸羊羊");
        mapper.updateUser(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    /*
    *   根据id查询用户
    * */
    @Test
    public void findUserByUid(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUser(13);
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

