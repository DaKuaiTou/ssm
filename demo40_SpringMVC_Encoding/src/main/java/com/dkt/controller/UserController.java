package com.dkt.controller;

import com.dkt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.UserController
 * @Date: 2022年12月31日 14:12
 * @Description:
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public String sayHello(User user){
        System.out.println(user);
        return "success";
    }
}
