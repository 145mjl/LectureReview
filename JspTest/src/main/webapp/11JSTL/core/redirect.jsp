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
	<!-- import ,forward와 달리 redirect는 request 영역은 공유되지 않음 -->
	<c:set var="requestVar" value="var of redirect.jsp (request scope)" scope="request" />
	<c:redirect url="./inc/OtherPage.jsp">
		<c:param name="user_param1" value="redirect.jsp에서 전달한 변수1"/>
		<c:param name="user_param2" value="redirect.jsp에서 전달한 변수2"/>
	</c:redirect>
</body>
</html>