package com.dkt.test;

import com.dkt.service.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author: dkt
 * @Pcakage: com.dkt.test.SpringTest
 * @Date: 2022年11月24日 20:12
 * @Description:
 */
public class SpringTest {

    @Test
    public void test01(){
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) application.getBean("userService");
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("druidUtil2");
        System.out.println(dataSource);
    }
}
