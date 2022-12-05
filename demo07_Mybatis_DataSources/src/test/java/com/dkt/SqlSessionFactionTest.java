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
    // 查询总人数
    @Test
    public void findAllUser(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Long allUser = mapper.findUserCount();
        System.out.println("用户总数：" + allUser);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 根据id查询用户
    @Test
    public void findUserById(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(3);
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    @Test
    // 根据username查询用户
    public void findUserByName(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserByName("李三");
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    @Test
    // 查询所有用户
    public void findUserAllList(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUserList = mapper.findAllUserList();
        System.out.println(allUserList);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    @Test
    public void findAllUserMao(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> allUserMap = mapper.findAllUserMap();
        for (Map<String, Object> map : allUserMap) {
            Set keys = map.keySet();
            Iterator iterator = keys.iterator();
            while (iterator.hasNext()){
                String key = (String) iterator.next();
                System.out.println(map.get(key));
            }
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    @Test
    public void findAllUserInfo(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserInfo> allUserInfo = mapper.findAllUserInfo();
        for (UserInfo userInfo : allUserInfo) {
            System.out.println(userInfo);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

