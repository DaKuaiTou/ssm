package com.dkt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: dkt
 * @Pcakage: com.dkt.AspectTest
 * @Date: 2022年12月08日 20:35
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AspectTest {
    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test01(){
        targetInterface.addUser();
    }
}
