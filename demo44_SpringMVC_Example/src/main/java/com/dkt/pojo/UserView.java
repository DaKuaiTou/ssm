package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.UserView
 * @Date: 2023年02月03日 16:38
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserView implements Serializable {
    private Integer currPage;
    private Integer pageSize;
    private User user;
}
