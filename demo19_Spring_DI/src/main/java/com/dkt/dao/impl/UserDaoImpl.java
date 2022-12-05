package com.dkt.dao.impl;

import com.dkt.dao.UserDao;

/**
 * @author: dkt
 * @Pcakage: com.dkt.dao.impl.UserDaoImpl
 * @Date: 2022年11月26日 16:34
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void findUser() {
        System.out.println("UserDao findUser Method running");
    }
}
