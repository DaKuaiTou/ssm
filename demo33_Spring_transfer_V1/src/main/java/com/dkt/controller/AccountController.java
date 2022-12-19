package com.dkt.controller;

import com.dkt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: dkt
 * @Pcakage: com.dkt.controller.AccountController
 * @Date: 2022年12月18日 20:02
 * @Description:
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    // 转账方法
    public void transfer(String fromName,String toName,Double money){
        accountService.transfer(fromName,toName,money);
    }
}
