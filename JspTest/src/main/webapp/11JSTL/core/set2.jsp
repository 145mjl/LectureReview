<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Vector" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>List 컬렉션 이용하기</h3>
	<%
		ArrayList<Person> pList=new ArrayList<Person>();
		pList.add(new Person("성삼문",52));
		pList.add(new Person("박팽년",54));
	%>
	<c:set var="personList" value="<%=pList %>" scope="request" />

	<ul>
		<li>이름 : ${requestScope.personList[0].name }</li>
		<li>나이 : <c:out value="${personList[0].age }" /></li>
	</ul>
	
	<h3>Map</h3>
	<%
		Map<String,Person> pMap=new HashMap<String,Person>();
		pMap.put("personArgs1",new Person("하위지",64));
		pMap.put("personArgs2",new Person("이개",63));
	%>
	<c:set var="personMap" value="<%= pMap %>" scope="request" />
	<ul>
		<li>이름 : ${requestScope.personMap.personArgs2.name}</li>
		<li>나이 : <c:out value="${personMap.personArgs2.age}" /></li>
	</ul>
</body>
</html>