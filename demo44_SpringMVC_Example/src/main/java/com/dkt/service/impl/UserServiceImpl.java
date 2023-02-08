package com.dkt.service.impl;

import com.dkt.dao.UserDao;
import com.dkt.pojo.PageBean;
import com.dkt.pojo.User;
import com.dkt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.UserServiceImpl
 * @Date: 2023年02月02日 21:28
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void batchDeleteUser(int[] ids) {
        userDao.batchDeleteUser(ids);
    }

    @Override
    public PageBean<User> selectUserListForPage(int currPage, int pageSize,User user) {
        int begin = (currPage-1)*pageSize;
        // 获取查询条件
        String username = user.getUsername();
        String password = user.getPassword();
        String nickname = user.getNickname();
        if(username!=null && username.length()>0){
            user.setUsername("%"+username+"%");
        }
        if(password!=null && password.length()>0){
            user.setPassword("%"+password+"%");
        }
        if(nickname!=null && nickname.length()>0){
            user.setNickname("%"+nickname+"%");
        }
        List<User> userList = userDao.selectUserListForPage(begin, pageSize,user);
        int totalCount = userDao.selectUserCount(user);
        PageBean pageBean = new PageBean(totalCount,userList);
        return pageBean;
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
