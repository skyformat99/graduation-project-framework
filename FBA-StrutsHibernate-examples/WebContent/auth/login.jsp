<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- ʹ��form��ǩ���ɱ�Ԫ�� -->
<s:form action="login">
	<s:textfield name="username" label="Username" />
	<s:textfield name="password" label="password" />
	<h5><font style="color:red;'">${error }</font></h5>
	<s:submit value="��¼" />
</s:form>
