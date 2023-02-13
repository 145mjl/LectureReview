<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		LinkedList<Person> lists=new LinkedList<Person>();
		lists.add(new Person("맹사성",34));
		lists.add(new Person("장영실",44));
		lists.add(new Person("신숙주",54));
	%>
	<h3>forEach - items에 Collection 사용</h3>
	<h4>LinkedList</h4>
	<c:set var="lists" value="<%= lists %>"/>
	<c:forEach items="${lists }" var="p">
		<div>
			이름 : ${p.name }, 나이 : ${p.age } <br>
		</div>
	</c:forEach>
	
	<h4>Map</h4>
	<%
		Map<String,Person> map=new HashMap<String,Person>();
		map.put("mss",new Person("맹사성",34));
		map.put("jys",new Person("장영실",44));
		map.put("ssj",new Person("신숙주",54));
	%>
	<c:set var="map" value="<%=map %>"/>
	<c:forEach items="${map }" var="m">
		<div>
		Key => ${m.key } <br>
		Value => 이름 : ${m.value.name } , 나이 ${m.value.age } <br>
		</div>
	</c:forEach>
</body>
</html>