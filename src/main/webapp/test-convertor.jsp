<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>测试参数能否从字符串转成java 的基本数据类型</h3>
	<form action="${pageContext.request.contextPath }/ParamAction3_testAutoConvertor.action" method="post">
		int : <input type="text" name="num"><font color="red"><s:fielderror fieldName="num"/></font><br>
		double : <input type="text" name="num2"><font color="red"><s:fielderror fieldName="num2"/></font><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	
	<h3>测试参数能否从字符串转成date类型（yyyy-MM-dd HH:mm:ss）</h3>
	<form action="${pageContext.request.contextPath }/ParamAction3_testDateConvertor.action" method="post">
		date: <input type="text" name="date"><font color="red"><s:fielderror fieldName="date"/></font><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	
	<h3>测试参数能否从字符串转成date类型（yyyy年MM月dd日 HH:mm:ss）， 需要自定义一个转换类</h3>
	<form action="${pageContext.request.contextPath }/ParamAction3_testDateConvertor.action" method="post">
		date: <input type="text" name="date"><font color="red"><s:fielderror fieldName="date"/></font><br>
		<input type="submit" value="提交">
	</form>
	<hr>
</body>
</html>