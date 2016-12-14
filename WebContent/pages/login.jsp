<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="validate">
		<s:textfield key="user.name.key" name="name" />
		<s:textfield key="user.pswd.key" name="password" />
		
		<s:submit key="user.signin" align="center" />
	</s:form>
</body>
</html>