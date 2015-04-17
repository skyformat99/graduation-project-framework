package com.freud.logic.authorize.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.freud.logic.authorize.beans.Role;
import com.freud.logic.authorize.beans.User;

public interface AuthorizeMapper {

	User getUser(@Param("username") String username);

	List<Role> getRoles(@Param("userId") int userId);

	Role getRoleByName(@Param("roleName") String roleName);

	void insertUser(User user);

	void inserUserRoleRelation(@Param("userId") int userId,
			@Param("roleId") int roleId);
}
