<%@page import="com.saeyan.dao.MemberDAO"%>
<%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%@page import="javax.naming.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
MemberDAO memDAO=MemberDAO.getInstance(); 
Connection conn=memDAO.getConnection();
out.println("DBCP 연동 성공");
%>

</body>
</html>