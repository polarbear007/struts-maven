<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font color="red"><s:actionerror/></font>
	<form action="${pageContext.request.contextPath }/HelloAction_login.action" method="post">
		username: <input type="text" name="user.username" placeholder="请输入用户名"><br>
		password: <input type="password" name="user.password" placeholder="请输入密码"><br>
		<input type="submit" value="登陆">
	</form>
</body>
</html>