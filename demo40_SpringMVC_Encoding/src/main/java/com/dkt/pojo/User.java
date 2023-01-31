package com.dkt.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.User
 * @Date: 2023年01月09日 17:17
 * @Description:
 */
@Data
public class User {
    private String username;
    private String password;
    private String nickname;
    private Date birthday;
    private List<String> hobbies;
}
