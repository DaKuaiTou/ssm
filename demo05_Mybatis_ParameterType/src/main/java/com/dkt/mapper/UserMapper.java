package com.dkt.mapper;

import com.dkt.pojo.QueryUser;
import com.dkt.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询所有用户
    List<User> findAllUser();
    // 添加用户
    void addUser(User user);
    // 根据id查询用户
    User findUserById(Integer id);
    // 更新用户
    void updateUser(User user);
    // 删除用户
    void deleteUser(Integer id);
    // 模糊查询
    List<User> searchUserByName(String username);
    // 修改用户——MAP
    void updateUserByMap(Map map);
    // 通过用户名和地址查询用户信息
    User searchUserByNameAndNickname1(String username,String nickname);
    User searchUserByNameAndNickname2(@Param("username")String username, @Param("nickname")String nickname);

    // 传递参数为pojo类型
    List<User> searchByCondition(QueryUser queryUser);
}
