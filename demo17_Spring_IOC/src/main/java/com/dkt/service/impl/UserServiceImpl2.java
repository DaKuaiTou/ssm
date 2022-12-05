package com.dkt.service.impl;

import com.dkt.service.UserService;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.UserServiceImpl
 * @Date: 2022年11月22日 10:56
 * @Description:
 */
public class UserServiceImpl2 implements UserService {
    public UserServiceImpl2() {
        System.out.println("UserServiceImpl method...");
    }

    @Override
    public String getUserName() {
        return "UserServiceImpl getUserName() Method running";
    }

    public void initData(){
        System.out.println("初始化时调用的方法");
    }
    public void saveData(){
        System.out.println("销毁时调用的方法");
    }
}
