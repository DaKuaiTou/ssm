package com.dkt;

import com.dkt.service.UserService;
import com.dkt.service.impl.UserServiceImpl;
import com.dkt.utils.BeanFactory;
import com.dkt.utils.BeanFactory2;
import com.dkt.utils.BeanFactory3;
import org.junit.Test;

/**
 * @author: dkt
 * @Pcakage: com.dkt.FactoryTest
 * @Date: 2022年11月18日 09:32
 * @Description:
 */
public class FactoryTest {
    /*
    *   原始方式
    * */
    @Test
    public void test1(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser();
    }
    /*
    *   接口方式
    * */
    @Test
    public void test2(){
        UserService userService = new UserServiceImpl();
        userService.addUser();
    }
    /*
    *   工厂模式/反射模式
    * */
    @Test
    public void test3() throws Exception {
        UserService userService = (UserService) Class.forName("com.dkt.service.impl.UserServiceImpl").newInstance();
        userService.addUser();
    }
    /*
    *   工厂模式降低耦合
    * */
    @Test
    public void test4(){
        UserService userService = (UserService) BeanFactory.createBean("com.dkt.service.impl.UserServiceImpl");
        userService.addUser();
    }
    /*
    *   通过配置的方式完成工厂模式配置对象
    * */
    @Test
    public void test5(){
        UserService userService = (UserService) BeanFactory2.createBean("userService");
        UserService userService2 = (UserService) BeanFactory2.createBean("userService");
        userService.addUser();
        userService2.addUser();
        System.out.println(userService == userService2);
    }
    /*
    *   通过
    * */
    @Test
    public void test6(){
        UserService userService = (UserService) BeanFactory3.createBean("userService");
        UserService userService2 = (UserService) BeanFactory3.createBean("userService");
        userService.addUser();
        userService2.addUser();
        System.out.println(userService == userService2);
    }
}
