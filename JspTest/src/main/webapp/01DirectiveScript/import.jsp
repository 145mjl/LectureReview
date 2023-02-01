<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Date today=new Date();
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	String todayStr=dateFormat.format(today);
	out.println("오늘 날짜 : "+todayStr);
	%>
	<!-- mapping을 해주지 않고 jsp파일을 실행하려면 webapp 바로 아래에 놓아야 한다. -->
</body>
</html>

