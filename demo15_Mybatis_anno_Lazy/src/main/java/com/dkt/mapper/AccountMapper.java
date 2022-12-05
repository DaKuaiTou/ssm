package com.dkt.mapper;

import com.dkt.pojo.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface AccountMapper {
    /*
    *   通过id查询账户信息，并且关联用户信息
    * */
    @Select("select * from t_account where aid=#{aid}")
    @Results({
            // 映射主键
            @Result(column = "uid",property = "uid",id = true),
            @Result(property = "user",one = @One(select = "com.dkt.mapper.UserMapper.findUserByUid"),column = "uid")
    })
    Account findAccountUserByAid(Integer aid);

    /*
    *   通过id查询账户信息
    * */
    @Select("select * from t_account where uid=#{uid}")
    List<Account> findUserAccountListByUid(Integer uid);
}
