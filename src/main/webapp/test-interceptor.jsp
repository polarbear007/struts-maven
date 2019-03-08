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
	<h2>测试自定义的拦截器： 能否解决 get 方式提交中文乱码问题</h2>
	<font color="red"><s:actionerror/></font>
	<form action="${pageContext.request.contextPath }/InterceptorAction.action" method="get">
		<input type="text" name="name" placeholder="请输入中文字符">
		<input type="submit" value="提交">
	</form>
</body>
</html>