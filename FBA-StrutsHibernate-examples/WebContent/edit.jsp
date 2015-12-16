<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Struts 2 Form Tags - Edit Person</title>

</head>
<body>
	<h1>Update Information</h1>

	<p>Use the form below to edit your information.</p>

	<s:form action="save" method="post">
		<s:textfield key="personBean.username" />
		<s:textfield key="personBean.password" />
		<s:submit key="submit" />
	</s:form>

</body>
</html>