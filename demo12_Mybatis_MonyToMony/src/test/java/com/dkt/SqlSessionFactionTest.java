package com.dkt;

import com.dkt.mapper.AccountMapper;
import com.dkt.mapper.RoleMapper;
import com.dkt.mapper.UserMapper;
import com.dkt.pojo.Account;
import com.dkt.pojo.Role;
import com.dkt.pojo.User;
import com.dkt.utils.SqlSessionFactionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author: dkt
 * @Pcakage: com.dkt.SqlSessionFactionTest
 * @Date: 2022年11月08日 22:05
 * @Description:
 */
public class SqlSessionFactionTest {
    // 根据id查询角色信息以及对应的用户信息
    @Test
    public void findRoleUserListById(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.findAllRoleUserList(2);
        System.out.println(roleList);

        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    // 根据id查询用户信息以及对应的角色信息
    @Test
    public void findUserRoleListById(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserRoleListByUid(2);
        System.out.println(user);
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }
}

