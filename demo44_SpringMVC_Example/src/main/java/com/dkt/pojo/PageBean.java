package com.dkt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.pojo.PageBean
 * @Date: 2023年02月03日 09:50
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private int totalCount;
    private List<T> list;
}
