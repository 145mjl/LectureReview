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
	<h3>url 태그로 링크 걸기</h3>
	<c:set var="requestVar" value="nyam" /> <!-- 안나옴 -->
	<c:url value="./inc/OtherPage.jsp" var="url">
		<c:param name="user_param1" value="c:url태그 하위 c:param값 1"/>
		<c:param name="user_param2" value="c:url태그 하위 c:param값 2"/>
	</c:url>
	
	<a href="${url }">OtherPage.jsp 바로가기</a>
</body>
</html>