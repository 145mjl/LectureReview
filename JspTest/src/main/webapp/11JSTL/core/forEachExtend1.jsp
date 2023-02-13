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
	<h3>향상된 for문 형태의 foreach태그</h3>
	<%
		String[] strAr={"red","green","blue","black"};
	%>
	
	<h4>c:set태그와 c:forEach의 items에 EL식 쓰기</h4>
	<c:set var="colorString" value="<%= strAr %>" />
	<c:forEach items="${colorString }" var="s">
		<div>color : ${s }</div>
	</c:forEach>
	
	<h4>items에 표현식 사용해서 strAr 대입 </h4>
	<div>EL식에 strAr 넣고 싶었는데 안됨 아니면 잊어버렸거나</div>
	<c:forEach items="<%= strAr %>" var="s" >
		<div>color : ${s}</div>
	</c:forEach>
	
</body>
</html>