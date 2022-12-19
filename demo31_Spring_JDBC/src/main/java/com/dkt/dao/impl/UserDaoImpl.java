package com.dkt.dao.impl;

import com.dkt.dao.UserDao;
import com.dkt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: dkt
 * @Pcakage: com.dkt.dao.impl.UserDaoImpl
 * @Date: 2022年12月09日 11:50
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public User findUserByName(String username) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }
}
