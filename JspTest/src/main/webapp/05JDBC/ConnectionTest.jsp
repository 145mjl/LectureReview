<%@page import="common.DBConnPool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="common.JdbcConnect" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JDBC 테스트 1</h2>
	<%
	JdbcConnect jdbc1=new JdbcConnect();
	jdbc1.close();
	%>
	<%
	String driver=application.getInitParameter("OracleDriver");
	String url=application.getInitParameter("OracleURL");
	String id=application.getInitParameter("OracleID");
	String pwd=application.getInitParameter("OraclePwd");
	
	JdbcConnect jdbc2=new JdbcConnect(driver,url,id,pwd);
	System.out.println("ConnectionTest.jsp 파일의 스크립틀릿에서 application.getInitParameter()로 생성자 인수 받아옴");
	jdbc2.close();
	
	JdbcConnect jdbc3=new JdbcConnect(application);
	jdbc3.close();
	%>
	<%
	DBConnPool dbConnPool=new DBConnPool();
	dbConnPool.close();
	%>
</body>
</html>