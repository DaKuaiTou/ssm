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
    @Test
    // 根据用户名查询
    public void findUserListByUsername(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.findUserListByUsername("张颜宇");
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 根据用户名和密码查询
    @Test
    public void findUserListByUsernameAndPass(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张颜宇");
        user.setPassword("123456");
        List<User> userList = mapper.findUserListByUsernameAndPass(user);
        for (User user1 : userList) {
            System.out.println(user1);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
    // 根据用户名和密码查询
    @Test
    public void findUserListByUsernameAndPass2(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张颜宇");
        user.setPassword("123456");
        List<User> userList = mapper.findUserListByUsernameAndPass2(user);
        for (User user1 : userList) {
            System.out.println(user1);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
    // 根据用户名和密码查询
    @Test
    public void findUserListByUsernameAndPass3(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张颜宇");
        user.setPassword("123456");
        List<User> userList = mapper.findUserListByUsernameAndPass3(user);
        for (User user1 : userList) {
            System.out.println(user1);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 修改用户
    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setUsername("李四");
        user.setPassword("lisi123");
        user.setNickname("小李");
        mapper.updateUser(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 删除用户
    @Test
    public void deleteUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(22);
        mapper.deleteUser(list);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

