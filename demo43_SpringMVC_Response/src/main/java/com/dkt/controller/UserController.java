package com.dkt.controller;

import com.dkt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/returnModelAndView")
    public ModelAndView returnModelAndView(){
        // 初始化数据模型视图
        ModelAndView modelAndView = new ModelAndView();
        // 数据模型视图对象绑定一个视图的名称，同时还要绑定一些数据【会将数据存储到request域对象中】
        modelAndView.setViewName("success");
        modelAndView.addObject("username","zhangsan");
        modelAndView.addObject("password","1234");
        // 返回模型视图，同样会去找视图解析器，解析viewName，使用请求转发跳转到对象的视图上面
        return modelAndView;
    }

    @RequestMapping("/methodForward")
    public String methodForward(){
        System.out.println("请求转发");
        //return "success";
        //return "forward:/WEB-INF/pages/success.jsp";  // 就不会通过视图解析器解析了
        //return "forward:/user/returnModelAndView";    // 转发到其它控制器上

        // 重定向无法访问到/WEB-INF/目录下的资源，因为重定向是客户端在其向服务器发送请求
        //return "redirect:/register.jsp";              // 重定向到其它页面
        return "redirect:/user/returnModelAndView";     // 重定向到其它控制器上
    }

    @RequestMapping("/responseJson")
    @ResponseBody
    public User responseJson(){
        System.out.println("responseJson");
        User user = new User();
        user.setUsername("张三");
        user.setPassword("1234");
        user.setBirthday(new Date());
        user.setNickname("老三");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("basketball");
        hobbies.add("football");
        user.setHobbies(hobbies);
        return user;
    }
}
