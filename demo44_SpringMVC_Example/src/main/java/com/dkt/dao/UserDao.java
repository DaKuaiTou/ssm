package com.dkt.dao;

import com.dkt.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    // 查询所有用户
    List<User> findAll();
    // 添加用户
    void addUser(User user);
    // 批量删除
    void batchDeleteUser(@Param(value = "ids")int[] ids);
    // 分页查询
    List<User> selectUserListForPage(@Param(value = "currPage") int currPage,@Param(value = "pageSize") int pageSize,@Param(value = "user")User user);
    // 查询总人数
    int selectUserCount(User user);
    // 修改用户信息
    void updateUser(User user);
}
