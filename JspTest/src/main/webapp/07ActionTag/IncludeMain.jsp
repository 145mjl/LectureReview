<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String outerPath1="./inc/OuterPage1.jsp";
	String outerPath2="./inc/OuterPage2.jsp";
	
	pageContext.setAttribute("pAttr", "동명왕");
	request.setAttribute("rAttr", "온조왕");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>지시어와 액션태그 동작 방식 비교</h2>
	<!-- 지시어 방식 -->
	<h3>include 지시자로 페이지포함하기</h3>
	<%@ include file="./inc/OuterPage1.jsp" %>
	<p>외부 파일에 선언한 변수 : <%= newVar1 %></p>
	
	<!-- 액션 태그 방식 -->
	<h3>표준 액션태그로 페이지 포함하기</h3>
	<h4>상대경로를 사용하여 포함되는 페이지 지정</h4>
	<jsp:include page="./inc/OuterPage2.jsp" />
	<h4>표현식을 사용하여 포함되는 페이지 지정 - 액션 태그는 표현식을 지원한다.</h4>
	<jsp:include page="<%=outerPath2 %>" />
	<p>외부 파일에 선언한 변수 : <%--= newVar2 --%> 컴파일 에러 발생하여 주석 처리</p>
	
</body>
</html>