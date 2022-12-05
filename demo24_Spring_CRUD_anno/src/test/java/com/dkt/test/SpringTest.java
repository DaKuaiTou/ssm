package com.dkt.test;

import com.dkt.pojo.User;
import com.dkt.service.UserService;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author: dkt
 * @Pcakage: com.dkt.test.SpringTest
 * @Date: 2022年12月01日 16:41
 * @Description:
 */
public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
    @Test
    public void findUser() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = userService.findUserById(3);
        System.out.println(user);
    }

    @Test
    public void addUser() throws SQLException {
        User user = new User();
        user.setUsername("赵六");
        user.setPassword("zhaoliu123");
        user.setNickname("老赵");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser(user);
    }

    @Test
    public void updateUser() throws SQLException {
        User user = new User();
        user.setId(26);
        user.setUsername("赵七");
        user.setPassword("zhaoqi666");
        user.setNickname("老赵");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.updateUser(user);
    }

    @Test
    public void deleteUser() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.deleteUserById(17);
    }
}
