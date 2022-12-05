package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.User_Role
 * @Date: 2022年11月14日 15:19
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private int rid;
    private String rname;
    private String rdesc;
    private List<User> userList;
}
