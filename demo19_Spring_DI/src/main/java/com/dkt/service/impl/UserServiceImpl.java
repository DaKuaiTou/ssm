package com.dkt.service.impl;

import com.dkt.dao.UserDao;
import com.dkt.dao.impl.UserDaoImpl;
import com.dkt.service.UserService;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.UserServiceImpl
 * @Date: 2022年11月26日 16:34
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void findUser() {
        System.out.println("userService findUser Method running");
        userDao.findUser();
    }
}
