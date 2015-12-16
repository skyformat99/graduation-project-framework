package com.freud.logic.authorize.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freud.framework.base.controller.BaseController;
import com.freud.framework.util.MD5Util;
import com.freud.logic.authorize.beans.User;
import com.freud.logic.authorize.service.AuthorizeService;

@Controller("AuthorizeController")
@RequestMapping("/auth")
public class AuthorizeController extends BaseController {

	/**
	 * The LOGGER.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(AuthorizeController.class);

	@Autowired
	private AuthorizeService authorizeService;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login() {
		LOGGER.debug("/auth/login Page visited");
		return "auth.login";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String register() {
		LOGGER.debug("/auth/register Page visited");
		return "auth.register";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String registerPOST(String username, String password,
			String passwordAgain) throws Exception {
		if (password == null || password.isEmpty() || passwordAgain == null
				|| passwordAgain.isEmpty()) {
			throw new Exception("密码不可为空");
		} else if (!password.equals(passwordAgain)) {
			throw new Exception("两次输入密码不同,请重新输入");
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(MD5Util.MD5(password).toLowerCase());

		authorizeService.insertUser(user);
		LOGGER.debug("/auth/register Page visited");
		return "redirect:/index";
	}

	@RequestMapping(value = { "/accessdenied" }, method = RequestMethod.GET)
	public String accessDenied() {
		LOGGER.debug("/auth/access_denied Page visited");
		return "auth.access_denied";
	}
}
