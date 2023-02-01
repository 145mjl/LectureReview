<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Collection" %>
    <%@ page import="java.text.SimpleDateFormat" %>
    
    <%
	SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	long add_date=s.parse(request.getParameter("add_date")).getTime();
	int add_int=Integer.parseInt(request.getParameter("add_int"));
	String add_str=request.getParameter("add_str");
	
	response.addDateHeader("myBirthday", add_date);
	response.addIntHeader("myNumber", add_int);
	response.addIntHeader("myNumber", 1983);
	response.addHeader("myName", add_str);
	response.setHeader("myName", "이병건");
	%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 - response</title>
</head>
<body>
	<h2>응답 헤더 정보 출력하기</h2>
	<%
	Collection<String> headerNames=response.getHeaderNames();
	for(String hName: headerNames){
		String hValue=response.getHeader(hName); 
		%>
		<li><%= hName %> : <%= hValue %></li>

	<% }%>
	
	<h2>myNumber만 출력하기</h2>
	<%
	Collection<String> myNum=response.getHeaders("myNumber");
	for(String n: myNum){%>
		<li>myNumber : <%= n %></li>
	<% }%>
</body>
</html>