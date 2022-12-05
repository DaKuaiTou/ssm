package com.dkt.test;

import com.dkt.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: dkt
 * @Pcakage: com.dkt.test.SpringTest
 * @Date: 2022年11月26日 16:42
 * @Description:
 */
public class SpringTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.findUser();
    }
}
