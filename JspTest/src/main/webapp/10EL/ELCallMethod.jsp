<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="el.MyELClass" %>
<%
	MyELClass m=new MyELClass();
	pageContext.setAttribute("myClass", m);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL - 영역에 저장(pageContext.setAttribute()) 후 메서드 호출</h3>
	<div>
	001225-300000 : ${myClass.getGender("001225-300000") }<br>
	001225-400000 : ${myClass.getGender("001225-400000") }<br>
	</div>
	
	<h3>클래스명(MyELClass)을 통한 정적 메서드 호출</h3>
	<div>
	${MyELClass.showGugudan(7) }
	</div>
</body>
</html>