package com.dkt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.UserController
 * @Date: 2022年12月31日 14:12
 * @Description:
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("sayHello1")
    public String sayHello1(){
        System.out.println("hello world1");
        return "success";
    }

    @RequestMapping(value = "sayHello2", method = {RequestMethod.POST})
    public String sayHello2(){
        System.out.println("hello world");
        return "success";
    }

    @RequestMapping(value = "sayHello3", params = "password=123")
    public String sayHello3(){
        System.out.println("hello world3");
        return "success";
    }

    @RequestMapping(value = "sayHello4",headers = {"content-type=text/*"})
    public String sayHello4(){
        System.out.println("hello world4");
        return "success";
    }
}
