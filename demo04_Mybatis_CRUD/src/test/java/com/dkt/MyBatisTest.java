package com.dkt;

import com.dkt.mapper.UserMapper;
import com.dkt.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.MyBatisTest
 * @Date: 2022年11月08日 15:03
 * @Description:
 */
public class MyBatisTest {
    private InputStream in = null;
    private SqlSession sqlSession = null;
    private UserMapper mapper = null;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sessionFactoryBuilder.build(in);
        sqlSession = sessionFactory.openSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    // 更改用户
    public void updateUserById(){
        User user = mapper.findUserById(19);
        user.setUsername("月巴兄");
        user.setPassword("2012");
        user.setNickname("临汾");
        mapper.updateUser(user);
    }

    @Test
    // 根据id查询用户
    public void findUserById(){
        User user = mapper.findUserById(19);
        System.out.println(user);
    }

    @Test
    // 查询所有用户
    public void findAllUser() throws IOException {
        List<User> allUser = mapper.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
    @Test
    // 添加用户
    public void addUser(){
        User user = new User(null,"张颜宇","123456","西安");
        mapper.addUser(user);
        System.out.println("添加成功，新增的用户ID是" + user.getId());
    }

    @Test
    // 删除用户
    public void deleteUser(){
        mapper.deleteUser(19);
    }

    @Test
    // 模糊查询
    public void searchUserByName(){
        List<User> userList = mapper.searchUserByName("张");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
