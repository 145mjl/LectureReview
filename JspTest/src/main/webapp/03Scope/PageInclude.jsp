<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4>器窃等 颇老</h4>
	<% int pInteger2=(Integer)(pageContext.getAttribute("pageInteger"));
		/* String pString2=pageContext.getAttribute("pageString").toString(); */
		Person pPerson2=(Person)(pageContext.getAttribute("pagePerson"));
	%>
	
	<ul>
		<li>Integer 按眉 : <%= pInteger2 %></li>
		<li>String 按眉 : <%= pageContext.getAttribute("pageString") %></li>
		<li>Person 按眉 : <%= pPerson2.getName() %><%= pPerson2.getAge() %></li>
	</ul>
</body>
</html>