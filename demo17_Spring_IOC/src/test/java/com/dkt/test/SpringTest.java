package com.dkt.test;

import com.dkt.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: dkt
 * @Pcakage: com.dkt.test.SpringTest
 * @Date: 2022年11月22日 10:59
 * @Description:
 */
public class SpringTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        String userName = userService.getUserName();
        System.out.println(userName);
    }

    /*
    * 测试对象的初始化和销毁时调用的方法
    * 创建对象的时候进行一些数据化的初始化
    * 销毁的时候执行一下数据的备份操作
    * */
    @Test
    public void test02(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        applicationContext.close();
    }
}
