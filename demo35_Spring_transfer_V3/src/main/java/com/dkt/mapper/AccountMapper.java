package com.dkt.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    void updateAccount(@Param("name") String name, @Param("money") Double money);
}
