<%@page import="com.freud.business.auth.action.LoginAction"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<body>
	Welcome ${sessionScope.SESSION_KEY_USER_NAME }
	<a href="login">login</a>
	<a href="register">register</a>
</body>