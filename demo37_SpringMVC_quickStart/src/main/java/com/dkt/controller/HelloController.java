package com.dkt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.UserController
 * @Date: 2022年12月31日 14:12
 * @Description:
 */

@Controller
public class HelloController {

    @RequestMapping("/hello/sayHello")
    public String sayHello(){
        System.out.println("hello world");
        return "success";
    }
}
