<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 转发到此错误页面的时候，strut2 拦截器会把异常对象压进值栈
		 key 就是 exception ,我们可以通过 el 表达式去获取这个异常对象所携带的信息
	 -->
	${exception }<br>
</body>
</html>