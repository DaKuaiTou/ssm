package com.dkt.mapper;

import com.dkt.pojo.QueryUser;
import com.dkt.pojo.User;
import com.dkt.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询所有用户信息
    List<User> findAllUser();
    // 添加用户
    void addUser(User user);
}
