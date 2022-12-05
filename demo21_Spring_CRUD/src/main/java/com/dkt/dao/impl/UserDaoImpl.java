package com.dkt.dao.impl;

import com.dkt.dao.UserDao;
import com.dkt.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.logging.Handler;

/**
 * @author: dkt
 * @Pcakage: com.dkt.dao.impl.UserDaoImpl
 * @Date: 2022年12月01日 15:38
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public User findUserById(Integer id) throws SQLException {
        String sql = "select * from user where id=?";
        User user = queryRunner.query(sql, new BeanHandler<>(User.class), id);
        return user;
    }

    @Override
    public void deleteUserById(Integer id) throws SQLException {
        String sql = "delete from user where id=?";
        queryRunner.update(sql,id);
    }

    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "update user set username=?,password=?,nickname=? where id=?";
        queryRunner.update(sql, user.getUsername(), user.getPassword(), user.getNickname(),user.getId());
    }

    @Override
    public void addUser(User user) throws SQLException {
        String sql = "insert into user values(null,?,?,?)";
        queryRunner.update(sql,user.getUsername(),user.getPassword(),user.getNickname());
    }
}
