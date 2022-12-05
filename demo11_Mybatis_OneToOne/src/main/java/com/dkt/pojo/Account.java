package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.Account
 * @Date: 2022年11月13日 22:37
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Integer aid;
    private Double money;
    private Integer uid;
    // 一对一关系，一个账户只能对应一个用户
    private User user;
}
