package com.dkt.dao.impl;

import com.dkt.dao.UserDao;
import com.dkt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.dao.impl.UserDaoImpl
 * @Date: 2022年12月09日 11:50
 * @Description:
 */
@Repository
public class UserDaoImpl2 extends JdbcDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        String sql = "select * from user where id=?";
        List<User> userList = getJdbcTemplate().query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setNickanem(rs.getString("nickname"));
                user.setId(rs.getInt("id"));
                return user;
            }
        },id);
        return userList.isEmpty() ? null:userList.get(0);
    }

    @Override
    public User findUserByName(String username) {
        List<User> userList = getJdbcTemplate().query("select * from user where username=?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setNickanem(rs.getString("nickname"));
                user.setId(rs.getInt("id"));
                return user;
            }
        }, username);
        if(userList.size() > 1){
            System.out.println("查出来的结果有很多");
        }
        return userList.get(0);
    }

    @Override
    public void updateUser(User user) {

    }
}
