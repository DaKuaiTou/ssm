package com.dkt.service;

import com.dkt.pojo.PageBean;
import com.dkt.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void addUser(User user);
    void batchDeleteUser(int[] ids);
    PageBean<User> selectUserListForPage(int currPage, int pageSize,User user);

    void updateUser(User user);
}
