<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
    <%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
	
	long creationTime=session.getCreationTime();
	String creationTimeStr=simpleDateFormat.format(new Date(creationTime));
	
	long lastTime=session.getLastAccessedTime();
	String lastTimeStr=simpleDateFormat.format(new Date(lastTime));
	
	//세션 유지 시간 : web.xml에서 20분으로 설정했으므로 20x60=1200초
	//세션 ID : 웹 브라우저를 열 때마다 새롭게 설정
	//최초 요청 시각 : 처음실행했을때
	//마지막 ~ : 웹페이지 새로고침시 바뀜
	%>
	
	<h2>세션설정확인</h2>
	
	<ul>
		<li>세션유지시간 : <%= session.getMaxInactiveInterval() %></li>
		<li>세션 아이디 :  <%= session.getId() %></li>
		<li>최초 요청 시각 : <%= creationTimeStr %></li>
		<li>마지막 요청 시각 : <%= lastTimeStr %></li>
	
	</ul>
</body>
</html>
