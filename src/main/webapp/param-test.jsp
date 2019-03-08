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
	<h3>测试自动封装action类的成员变量</h3>
	<form action="${pageContext.request.contextPath }/ParamAction_testParam0.action" method="post">
		luckyNum: <input type="text" name="luckyNum" placeholder="请输入幸运数字"><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	
	<h3>测试modeldriven 参数封装  student 对象</h3>
	<form action="${pageContext.request.contextPath }/ParamAction_testParam1.action" method="post">
		name: <input type="text" name="name" placeholder="请输入学生的姓名"><br>
		age : <input type="text" name="age" placeholder="请输入学生的年龄"><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	
	<h3>测试封装数组</h3>
	<form action="${pageContext.request.contextPath }/ParamAction_testArrayParam.action" method="post">
		array:<input type="text" name="array" ><br>
		array:<input type="text" name="array" ><br>
		array:<input type="text" name="array" ><br>
		array:<input type="text" name="array" ><br>
		array:<input type="text" name="array" ><br>
		array:<input type="submit" value="提交">
	</form>
	<hr>
	
	<h3>测试封装List集合</h3>
	<form action="${pageContext.request.contextPath }/ParamAction2_testListParam.action" method="post">
		第一个对象的name:<input type="text" name="list[0].name" ><br>
		第一个对象的age:<input type="text" name="list[0].age" ><br>
		第二个对象的name:<input type="text" name="list[1].name" ><br>
		第二个对象的age:<input type="text" name="list[1].age" ><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	
	<h3>测试封装Map集合</h3>
	<form action="${pageContext.request.contextPath }/ParamAction2_testMapParam.action" method="post">
		第一个对象的name:<input type="text" name="map.stu1.name" ><br>
		第一个对象的age:<input type="text" name="map.stu1.age" ><br>
		第二个对象的name:<input type="text" name="map.stu2.name" ><br>
		第二个对象的age:<input type="text" name="map.stu2.age" ><br>
		<input type="submit" value="提交">
	</form>
	<hr>
</body>
</html>