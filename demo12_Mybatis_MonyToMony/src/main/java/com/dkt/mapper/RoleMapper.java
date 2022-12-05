package com.dkt.mapper;

import com.dkt.pojo.Role;

import java.util.List;

public interface RoleMapper {
    /*
    *   根据id查询角色信息，以及对应的用户信息
    * */
    List<Role> findAllRoleUserList(Integer rid);
}
