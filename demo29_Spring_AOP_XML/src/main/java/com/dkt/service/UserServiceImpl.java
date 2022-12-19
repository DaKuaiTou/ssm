package com.dkt.service;

import org.springframework.stereotype.Service;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.UserServiceImpl
 * @Date: 2022年12月08日 23:15
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findUser() {
        try {
            Thread.sleep(3000);
            System.out.println("查询执行");
            return "大块头";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public void add() {
        System.out.println("add 方法执行了");
        int i = 1/0;
    }

    @Override
    public void delete(Integer integer) {
        System.out.println("删除方法执行了");
    }

    @Override
    public void update() {
        System.out.println("执行方法执行了");
    }
}
