package com.dkt;

import com.dkt.mapper.UserMapper;
import com.dkt.pojo.QueryUser;
import com.dkt.pojo.User;
import com.dkt.utils.SqlSessionFactionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: dkt
 * @Pcakage: com.dkt.SqlSessionFactionTest
 * @Date: 2022年11月08日 22:05
 * @Description:
 */
public class SqlSessionFactionTest {

    @Test
    public void sqlSessionTest(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 修改用户
    @Test
    public void updateUserByMap(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","李三");
        map.put("id",3);
        mapper.updateUserByMap(map);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 通过用户名和地址查询用户
    @Test
    public void searchUserByNameAndAddress1(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.searchUserByNameAndNickname1("李三", "li");
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
    @Test
    public void searchUserByNameAndAddress2(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.searchUserByNameAndNickname2("李三", "li");
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 分页查询
    @Test
    public void searchByCondition(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张颜宇");
        QueryUser queryUser = new QueryUser(1L,2,user);
        List<User> userList = mapper.searchByCondition(queryUser);
        for (User user1 : userList) {
            System.out.println(user1);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}
