package com.dkt;

import com.dkt.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: dkt
 * @Pcakage: com.dkt.MyAspectTest
 * @Date: 2022年12月08日 23:45
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MyAspectTest {
    @Autowired
    private UserService userService;
    @Test
    public void findUser(){
        userService.findUser();
    }
    @Test
    public void delete(){
        userService.delete(1);
    }
    @Test
    public void update(){
        userService.update();
    }
    @Test
    public void add(){
        userService.add();
    }
}
