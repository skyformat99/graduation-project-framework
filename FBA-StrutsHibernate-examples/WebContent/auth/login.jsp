<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- 使用form标签生成表单元素 -->
<s:form action="login">
	<s:textfield name="username" label="Username" />
	<s:textfield name="password" label="password" />
	<h5><font style="color:red;'">${error }</font></h5>
	<s:submit value="登录" />
</s:form>
