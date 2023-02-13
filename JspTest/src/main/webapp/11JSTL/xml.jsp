<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="bookList.xml" var="booklist" charEncoding="UTF-8"/>
	<x:parse xml="${booklist }" var="books"/>
	
	<h4>xml 파싱 - 하나씩</h4>
	<x:out select="$books/booklist/book[1]/name"/><br>
	<x:out select="$books/booklist/book[1]/author"/><br>
	<x:out select="$books/booklist/book[1]/price"/><br>
	
	<h4>xml 파싱 - forEach</h4>
	<x:forEach select="$books/booklist/book" var="item">
			<x:out select="$item/name" /><br>
			<x:out select="$item/author" /><br>
		<x:choose>
			<x:when select="$item/price>=20000" >
				2만원 이상<br>
			</x:when>
			<x:otherwise>
				2만원 미만<br>
			</x:otherwise>
		</x:choose>
		<br>
	</x:forEach>
	
	<h4>forEach, if</h4>
	<x:forEach select="$books/booklist/book" var="b">
		<x:out select="$b/name"/><br>
		<x:out select="$b/author"/><br>
		<x:out select="$b/price"/><br>
		<x:if select="$b/name='코스모스'">구매함</x:if><br><br>
	</x:forEach>
</body>
</html>