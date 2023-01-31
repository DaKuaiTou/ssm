package com.dkt.controller;

import com.dkt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.UserController
 * @Date: 2023年01月05日 22:12
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/findUser")
    public String findUser(@RequestParam("username") String name, int age){
        System.out.println("用户姓名：" + name + "，用户年龄：" + age);
        return "success";
    }

    @RequestMapping(path = "/register",method = {RequestMethod.POST})
    public String register(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping(path = "/register2",method = {RequestMethod.POST})
    public String register1(User user){
        System.out.println(user);
        return "success";
    }

    @PostMapping("delete")
    public String delete(@RequestParam List<Integer> ids){
        System.out.println("要删除的数据是：" + ids);
        return "success";
    }
}
