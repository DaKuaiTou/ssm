package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.QueryUser
 * @Date: 2022年11月09日 09:58
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryUser {
    // 当前页
    private Long currentPage;
    // 每页显示的数据
    private Integer pageSize;
    // limit后第一个占位符，
    private Long offSet;
    // 作为搜索条件存在
    private User user;
    public Long getOffSet(){
        return (currentPage-1)*pageSize;
    }

    public QueryUser(Long currentPage, Integer pageSize, User user) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.user = user;
    }
}
