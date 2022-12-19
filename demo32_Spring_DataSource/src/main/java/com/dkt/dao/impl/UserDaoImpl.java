package com.dkt.dao.impl;

import com.dkt.dao.UserDao;
import com.dkt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.dao.impl.UserDao
 * @Date: 2022年12月13日 10:19
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<User> findUser() {
        String sql = "select * from user";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setNickname(rs.getString("nickname"));
                return user;
            }
        });
        return userList;
    }
}
