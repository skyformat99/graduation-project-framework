package com.freud.logic.authorize.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.freud.logic.authorize.beans.Role;
import com.freud.logic.authorize.beans.User;
import com.freud.logic.authorize.mapper.AuthorizeMapper;

public class AuthorizeService {

	@Autowired
	private AuthorizeMapper authorizeMapper;

	private static final String ROLE_ADMIN = "ROLE_USER";

	public User getUser(String username) {

		User user = authorizeMapper.getUser(username);

		List<Role> roles = authorizeMapper.getRoles(user.getId());

		for (Role role : roles) {
			user.getRoles().add(role.getRoleName());
		}

		return user;
	}

	public AuthorizeMapper getAuthorizeMapper() {
		return authorizeMapper;
	}

	public void setAuthorizeMapper(AuthorizeMapper authorizeMapper) {
		this.authorizeMapper = authorizeMapper;
	}

	public void insertUser(User user) {
		Role role = authorizeMapper.getRoleByName(ROLE_ADMIN);
		authorizeMapper.insertUser(user);
		User exist = authorizeMapper.getUser(user.getUsername());
		authorizeMapper.inserUserRoleRelation(exist.getId(), role.getRoleId());
	}
}
