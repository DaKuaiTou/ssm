package com.dkt.service.impl;

import com.dkt.dao.UserDao;
import com.dkt.pojo.User;
import com.dkt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.UserServiceImpl
 * @Date: 2022年12月01日 15:39
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(Integer id) throws SQLException {
        return userDao.findUserById(id);
    }

    @Override
    public void deleteUserById(Integer id) throws SQLException {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) throws SQLException {
        userDao.updateUser(user);
    }

    @Override
    public void addUser(User user) throws SQLException {
        userDao.addUser(user);
    }
}
