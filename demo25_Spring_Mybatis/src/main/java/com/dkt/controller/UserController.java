package com.dkt.controller;

import com.dkt.mapper.UserMapper;
import com.dkt.pojo.User;
import com.dkt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.UserController
 * @Date: 2022年12月03日 14:44
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public List<User> findUser(){
        return userService.findUser();
    }
    public User findUserById(Integer id){
        return userService.findUserById(id);
    }
    public void addUser(User user){
        userService.addUser(user);
    }
    public void deleteUser(Integer id){
        userService.deleteUser(id);
    }
    public void updateUser(User user){
        userService.updateUser(user);
    }
}
