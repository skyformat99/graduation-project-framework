<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="Shortcut Icon"
	href="${pageContext.request.contextPath}/resources/img/icon.png" />
<title><tiles:insertAttribute name="title" /></title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/fba.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" class="index">

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="advertise" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />

	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.easing.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/classie.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/cbpAnimatedHeader.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jqBootstrapValidation.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/freelancer.js"></script>

</body>
</html>
