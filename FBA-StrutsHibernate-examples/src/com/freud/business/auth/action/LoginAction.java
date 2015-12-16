package com.freud.business.auth.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.freud.business.auth.bean.User;
import com.freud.business.auth.service.AuthorizeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	public static final String SESSION_KEY_USER_NAME = "SESSION_KEY_USER_NAME";
	private static final long serialVersionUID = 1030294046920869257L;
	private String username;
	private String password;
	private String passwordAgain;

	private String error;

	@Autowired
	private AuthorizeService authorizeService;

	// 处理用户请求的execute方法
	public String login() throws Exception {

		String method = ServletActionContext.getRequest().getMethod();

		if (method.equals("POST")) {
			if (isInvalid(getUsername())) {
				setError("登录失败：用户名不可以为空");
				return INPUT;
			}

			if (isInvalid(getPassword())) {
				setError("登录失败：密码不可以为空");
				return INPUT;
			}

			User user = authorizeService.getUser(username);

			if (user == null) {
				setError("登录失败：用户名不存在");
				System.out.println(getUsername() + "。登录失败：用户名不存在");
				return INPUT;
			}

			if (user.getPassword().equals(getPassword())) {
				// 通过ActionContext对象访问Web应用的Session
				ActionContext.getContext().getSession()
						.put(SESSION_KEY_USER_NAME, getUsername());
				System.out.println(getUsername() + "。登录成功");
				return SUCCESS;
			} else {
				setError("登录失败：密码错误");
				System.out.println(getUsername() + "。登录失败：密码错误");
				return INPUT;
			}
		} else {
			return INPUT;
		}
	}

	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}

	public String register() {
		String method = ServletActionContext.getRequest().getMethod();

		if (method.equals("POST")) {
			if (isInvalid(getUsername())) {
				setError("注册失败：用户名不可以为空");
				return INPUT;
			}

			if (isInvalid(getPassword())) {
				setError("注册失败：密码不可以为空");
				return INPUT;
			}

			if (!getPassword().equals(getPasswordAgain())) {
				setError("注册失败：两次输入密码不同");
				return INPUT;
			}
			User user = new User();
			user.setUsername(getUsername());
			user.setPassword(getPassword());
			authorizeService.saveUser(user);
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public String show() {
		return SUCCESS;
	}

	public String qurey() {
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

}