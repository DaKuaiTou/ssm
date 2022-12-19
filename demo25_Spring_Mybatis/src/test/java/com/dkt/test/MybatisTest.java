package com.dkt.test;

import com.dkt.controller.UserController;
import com.dkt.mapper.UserMapper;
import com.dkt.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.test.MybatisTest
 * @Date: 2022年12月02日 15:16
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class MybatisTest {
    @Autowired
    private UserController userController;

    @Test
    public void test() throws IOException {
        // 加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("spring.xml");
        // 创建SqlSessionFactionBuild对
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 使用build对象去加载字节输入流
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findUser();
        System.out.println(userList);
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> userList = userMapper.findUser();
        System.out.println(userList);
    }

    @Test
    public void findUser(){
        List<User> user = userController.findUser();
        System.out.println(user);
    }

    @Test
    public void findUserById(){
        User user = userController.findUserById(3);
        System.out.println(user);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("勾八");
        user.setPassword("gouba123");
        user.setNickname("老勾");
        userController.addUser(user);
    }

    @Test
    public void updateUser(){
        User user = userController.findUserById(3);
        user.setPassword("lisan123");
        userController.updateUser(user);
    }

    @Test
    public void deleteUser(){
        userController.deleteUser(3);
        System.out.println("随便添加一行代码，测试git");
    }
}
