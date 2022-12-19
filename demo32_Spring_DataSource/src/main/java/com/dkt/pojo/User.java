package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.User
 * @Date: 2022年12月13日 10:19
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
}
