package com.dkt.mapper;

import com.dkt.pojo.QueryUser;
import com.dkt.pojo.User;
import com.dkt.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 根据用户名查询用户
    List<User>  findUserListByUsername(@Param("username") String username);

    // 根据用户名和密码进行查询
    List<User> findUserListByUsernameAndPass(User user);
    List<User> findUserListByUsernameAndPass2(User user);
    List<User> findUserListByUsernameAndPass3(User user);

    // 更新用户
    void updateUser(User user);

    // 批量删除
    void deleteUser(List<Integer> list);
}
