package com.freud.framework.spring.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public final class SecurityContextUtil {

	/**
	 * 
	 */
	public static UserDetails getUserDetails() throws AccessDeniedException {

		UserDetails userDetails = null;

		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();

		if (null != auth) {
			if (auth.getPrincipal() instanceof UserDetails) {
				userDetails = (UserDetails) auth.getPrincipal();
			}
		}

		return userDetails;
	}

	public static String getUserName() {
		return getUserDetails() == null ? null : getUserDetails().getUsername();
	}
}
