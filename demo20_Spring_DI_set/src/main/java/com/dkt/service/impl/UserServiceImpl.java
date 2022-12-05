package com.dkt.service.impl;

import com.dkt.dao.UserDao;
import com.dkt.dao.impl.UserDaoImpl;
import com.dkt.pojo.User;
import com.dkt.service.UserService;

import java.util.*;

/**
 * @author: dkt
 * @Pcakage: com.dkt.service.impl.UserServiceImpl
 * @Date: 2022年11月26日 16:34
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private String userName;
    private Integer age;
    private List<String> list;
    private List<User> userList;
    private Map<String,User> userMap;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void findUser() {
        System.out.println("userService findUser Method running");
        System.out.println(userName + "," + age);
        System.out.println(list);
        System.out.println(userList);
        Set<String> set = userMap.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            User user = userMap.get(key);
            System.out.println(key + ":" + user);
        }
        System.out.println(properties);
        userDao.findUser();
    }
}
