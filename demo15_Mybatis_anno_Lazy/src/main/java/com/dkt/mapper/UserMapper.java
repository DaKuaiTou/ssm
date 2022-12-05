package com.dkt.mapper;

import com.dkt.pojo.Account;
import com.dkt.pojo.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /*
    *   根据id查询用户信息
    * */
    @Select("select * from t_user where uid=#{uid}")
    User findUserByUid(Integer uid);

    /*
    *  根据id查询用户信息，并关联账户信息
    * */
    @Select("select * from t_user where uid=#{uid}")
    @Results({
            @Result(id = true,property = "uid",column = "uid"),
            @Result(many = @Many(select = "com.dkt.mapper.AccountMapper.findUserAccountListByUid"),column = "uid",property = "accountList")
    })
    User findUserByUid2(Integer uid);
}
