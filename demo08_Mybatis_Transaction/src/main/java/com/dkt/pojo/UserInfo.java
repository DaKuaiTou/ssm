package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.User
 * @Date: 2022年11月08日 14:57
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer idInfo;
    private String username;
    private String passwordInfo;
    private String nicknameInfo;
}
