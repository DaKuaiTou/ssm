package com.dkt.service.impl;

import com.dkt.service.UserService;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.UserServiceImpl
 * @Date: 2022年11月22日 10:56
 * @Description:
 */
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("UserServiceImpl method...");
    }

    @Override
    public String getUserName() {
        return "UserServiceImpl getUserName() Method running";
    }
}
