<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="common.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="directVar" value="100" />
	<c:set var="elVar" value="${directVar mod 5 }" />
	<c:set var="expVar" value="<%=new Date() %>" />
	<c:set var="betweenVar">"변수값 설정"</c:set>
	
	<h3>EL을 이용해 변수 출력</h3>
	<ul>
		<li>directVar : <c:out value="${directVar}"/> </li>
		<li>elVar : ${elVar} </li>
		<li>expVar : ${expVar }</li>
		<li>betweenVar : ${betweenVar}</li>
	</ul>
	
	<h3>자바빈즈 생성 1 - 생성자 사용</h3>
	<c:set var="personVar1" value='<%=new Person("박문수",50) %>' scope="request" />
	<ul>
		<li>이름 : <c:out value="${personVar1.name }"/></li>
		<li>나이 : <c:out value="${requestScope.personVar1.age }"/></li>
	</ul>
	
	<h3>자바빈즈 생성 2 - target,property 사용</h3>
	<c:set var="personVar2" value='<%= new Person() %>' scope="request" />
	<c:set target="${personVar2 }" property="name" value="정약용" />
	<c:set target="${personVar2 }" property="age" value="55" />
	<ul>
		<li>이름 : ${personVar2.name} </li>
		<li>나이 : <c:out value="${personVar2.age}"/></li>
	</ul>
</body>
</html>