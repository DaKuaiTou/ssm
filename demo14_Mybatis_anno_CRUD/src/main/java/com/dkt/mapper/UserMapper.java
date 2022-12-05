package com.dkt.mapper;

import com.dkt.pojo.Account;
import com.dkt.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    /*
     *   新增用户
     * */
    @Insert("insert into t_user (username,sex,birthday,address) values(#{username},#{sex},#{birthday},#{address})")
    @SelectKey(keyProperty = "uid",keyColumn = "uid",resultType = int.class,before = false,statement = "select last_insert_id()")
    int addUser(User user);

    /*
    *   删除用户
    * */
    @Delete("delete from t_user where uid=#{uid}")
    int deleteUser(Integer uid);

    /*
    *   修改用户
    * */
    @Update("update t_user set username=#{username},sex=#{sex},birthday=#{birthday},address=#{address} where uid=#{uid}")
    int updateUser(User user);

    /*
    *   根据id查询用户
    * */
    @Select("select * from t_user where uid=#{uid}")
    User findUser(Integer uid);
}
