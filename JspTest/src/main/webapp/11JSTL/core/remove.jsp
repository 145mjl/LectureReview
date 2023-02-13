<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="scopeVar" value="page Value" />
<c:set var="scopeVar" value="request Value" scope="request"/>
<c:set var="scopeVar" value="session Value" scope="session"/>
<c:set var="scopeVar" value="application Value" scope="application"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>출력</h4>
	<ul>
		<li>scopeVar : <c:out value="${scopeVar }" /> </li>
		<!-- ${scopeVar}는 가장 가까운, 즉 가장 작은 영역의 값을 출력한다. 따라서 pageScope이 없으면 requestScope에 설정된 변수가 나옴 -->
		<li>requestScope.scopeVar : <c:out value="${requestScope.scopeVar }" /> </li>
		<li>sessionScope.scopeVar : <c:out value="${sessionScope.scopeVar }" /> </li>
		<li>applicationScope.scopeVar : <c:out value="${applicationScope.scopeVar }" /> </li>
	</ul>
	
	<h4>session 영역에서 삭제하기</h4>
	<c:remove var="scopeVar" scope="session" />
	<ul>
		<li>scopeVar : <c:out value="${scopeVar }" /> </li>
		<li>requestScope.scopeVar : <c:out value="${requestScope.scopeVar }" /> </li>
		<li>sessionScope.scopeVar : <c:out value="${sessionScope.scopeVar }" /> </li>
		<li>applicationScope.scopeVar : <c:out value="${applicationScope.scopeVar }" /> </li>
	</ul>
	
	<h4>scope 지정없이 삭제</h4>
	<c:remove var="scopeVar" />
	<ul>
		<li>scopeVar : <c:out value="${scopeVar }" /> </li>
		<li>requestScope.scopeVar : <c:out value="${requestScope.scopeVar }" /> </li>
		<li>sessionScope.scopeVar : <c:out value="${sessionScope.scopeVar }" /> </li>
		<li>applicationScope.scopeVar : <c:out value="${applicationScope.scopeVar }" /> </li>
	</ul>
</body>
</html>