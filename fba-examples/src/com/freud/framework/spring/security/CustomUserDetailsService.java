package com.freud.framework.spring.security;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.freud.logic.authorize.service.AuthorizeService;

public class CustomUserDetailsService implements UserDetailsService {

	/**
	 * LOGGER
	 */
	private static final Logger LOGGER = Logger
			.getLogger(CustomUserDetailsService.class);

	/**
	 * The authorizeService.
	 */
	private AuthorizeService authorizeService;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {

		UserDetails userDetails = null;

		try {

			System.out.println(username);
			com.freud.logic.authorize.beans.User user = authorizeService
					.getUser(username);
			System.out.println(user.getPassword());
			userDetails = new User(user.getUsername(), user.getPassword(),
					getAuthorities(user.getRoles()));

			LOGGER.info(MessageFormat.format(
					"User [{0}] login the page at {1}", username, new Date()));

		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("Error in retrieving user");
		}

		return userDetails;
	}

	public Collection<GrantedAuthority> getAuthorities(List<String> authorizes) {

		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(
				authorizes.size());
		for (String authorize : authorizes) {
			if (null != authorize)
				authList.add(new SimpleGrantedAuthority(authorize));
		}
		return authList;
	}

	public AuthorizeService getAuthorizeService() {
		return authorizeService;
	}

	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;
	}

}
