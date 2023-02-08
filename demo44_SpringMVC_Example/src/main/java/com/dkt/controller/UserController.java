package com.dkt.controller;

import com.dkt.pojo.PageBean;
import com.dkt.pojo.Result;
import com.dkt.pojo.User;
import com.dkt.pojo.UserView;
import com.dkt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.UserController
 * @Date: 2023年02月02日 21:25
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 查询所有
    @RequestMapping("/findAll")
    public Result findAll(){
        try {
            List<User> userList = userService.findAll();
            Result result = new Result(true,userList,"查询成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"查询失败");
            return result;
        }
    }

    // 添加用户
    @RequestMapping("/addUser")
    public Result addUser(@RequestBody User user){
        try {
            userService.addUser(user);
            Result result = new Result(true,null,"添加成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"添加失败");
            return result;
        }
    }

    // 批量删除
    @RequestMapping("/{ids}")
    public Result batchDeleteUser(@PathVariable("ids") int[] ids){
        try {
            userService.batchDeleteUser(ids);
            Result result = new Result(true,null,"批量删除成功");
            return result;
        } catch (Exception e) {
            Result result = new Result(false,null,"批量删除失败");
            return result;
        }
    }

    // 分页查询
    @RequestMapping("/userListForPage")
    public Result userListForPage(@RequestBody UserView userView){
        Integer currPage = userView.getCurrPage();
        Integer pageSize = userView.getPageSize();
        User user = userView.getUser();
        try {
            PageBean<User> pageBean  = userService.selectUserListForPage(currPage, pageSize,user);
            Result result = new Result(true,pageBean,"分页查询成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"分页查询失败");
            return result;
        }
    }

    // 修改用户
    @RequestMapping("/updateUser")
    public Result updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
            Result result = new Result(true,null,"添加成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"添加失败");
            return result;
        }
    }

}
