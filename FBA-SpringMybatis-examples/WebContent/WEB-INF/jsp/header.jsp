<%@page import="com.freud.framework.spring.security.SecurityContextUtil"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">BBS</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}">社区管理</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}">首页</a></li>
				<li><a href="${pageContext.request.contextPath}/tiezi/list">社区论坛</a></li>
				<li><a href="${pageContext.request.contextPath}/chat/index">聊天室</a></li>
				<li><a href="${pageContext.request.contextPath}/toupiao/list">投票</a></li>
				<li class="dropdown">
				    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
				      	管理<span class="caret"></span>
				    </a>
				    <ul class="dropdown-menu">
				    	<li><a href="${pageContext.request.contextPath}/manage/notify/update">修改通知</a></li>
						<li><a href="${pageContext.request.contextPath}/manage/xinwen/add">添加新闻</a></li>
						<li><a href="${pageContext.request.contextPath}/manage/toupiao/list">管理投票人</a></li>      
				    </ul>
				</li>
			</ul>
			<% if(SecurityContextUtil.getUserName()==null){
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden"><a href="#page-top"></a></li>
				<li class="page-scroll"><a
					href="${pageContext.request.contextPath}/auth/login">登录</a></li>
				<li class="page-scroll"><a
					href="${pageContext.request.contextPath}/auth/register">注册</a></li>
			</ul>
			<% }else{%>
				<ul class="nav navbar-nav navbar-right">
					<li class="hidden"><a href="#page-top"></a></li>
					<li class="page-scroll"><a
						href="#" class="btn btn-default"><%=SecurityContextUtil.getUserName() %></a></li>
					<li class="page-scroll"><a
						href="${pageContext.request.contextPath}/auth/logout">注销</a></li>
				</ul>
			<% } %>
		</div>
	</div>
</nav>
