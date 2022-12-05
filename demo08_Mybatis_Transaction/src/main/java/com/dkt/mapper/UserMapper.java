package com.dkt.mapper;

import com.dkt.pojo.QueryUser;
import com.dkt.pojo.User;
import com.dkt.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询总人数
    Long findUserCount();
    // 根据id查询用户
    User findUserById(Integer id);
    // 根据username查询用户
    User findUserByName(String username);
    // 查询所有用户
    List<User> findAllUserList();
    // 查询所有用户
    List<Map<String,Object>> findAllUserMap();
    // 查询用户信息
    List<UserInfo> findAllUserInfo();

    // 添加用户
    void addUser(User user);
}
