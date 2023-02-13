<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>OtherPage.jsp</h4>
	저장된 값 : ${requestVar }<br>
	매개변수 1 : ${param.user_param1 }<br>
	매개변수 2 : ${param.user_param2 }<br>
</body>
</html>