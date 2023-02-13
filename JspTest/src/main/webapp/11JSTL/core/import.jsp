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
	<c:set var="requestVar" value="var of import.jsp (request scope)" scope="request" />
	<c:import url="./inc/OtherPage.jsp" var="contents" >
		<c:param name="user_param1" value="import.jsp 파일에서 OtherPage.jsp로 전송한 인자값1"/>
		<c:param name="user_param2" value="import.jsp 파일에서 OtherPage.jsp로 전송한 인자값2"/>
	</c:import>
	
	<h4>다른 문서 삽입하기</h4>
	${contents }
	
	<h4>외부 자원 삽입하기</h4>
	<iframe src="./inc/GoldPage.jsp" style="width:100%;height:600px;"></iframe>
</body>
</html>