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
	<h3>forEach - item없이 </h3>
	<c:forEach var="i" begin="1" end="3">
		반복문 도는 중 - ${i }회<br>
	</c:forEach>
	<c:forEach var="i" begin="1" end="4" step="2">
		반복문 도는 중(begin 1, end 4, step 2) - ${i }<br>
	</c:forEach>
	
	<h3>forEach의 varStatus</h3>
	begin 3, end 5 , step default
	<c:forEach var="i" begin="3" end="5" varStatus="loop">
		<div>
			count : ${loop.count } , index : ${loop.index } , current : ${loop.current } , first : ${loop.first } , last : ${loop.last}
		</div>
	</c:forEach>
</body>
</html>