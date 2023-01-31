package com.dkt.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.User
 * @Date: 2023年01月07日 18:46
 * @Description:
 */
@Data
public class User{
    private String username;
    private String password;
    private String nickname;
    private String birthday;

    private List<String> hobbies;
}
