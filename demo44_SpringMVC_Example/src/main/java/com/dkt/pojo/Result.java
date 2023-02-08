package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.Result
 * @Date: 2023年02月02日 14:08
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private Boolean flag; //增删改是否成功
    private Object result;  // 查询结果的封装
    private String message; // 成功与否的信息
}
