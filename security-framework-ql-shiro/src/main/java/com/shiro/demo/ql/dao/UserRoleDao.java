package com.shiro.demo.ql.dao;

import com.shiro.demo.ql.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleDao extends JpaRepository<UserRoles,Long> {

    List<UserRoles> findUserRolesByUserId(String userid);
}
