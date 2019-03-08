<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
requestScope: <s:property value="#request.requestScope" /> <br>
sessionScope: <s:property value="#session.sessionScope" /> <br>
applicationtScope: <s:property value="#application.applicationScope" /> <br>
</body>
</html>