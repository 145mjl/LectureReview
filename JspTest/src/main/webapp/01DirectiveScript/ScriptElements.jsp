<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		public int add(int num1,int num2){
			return num1+num2;
		}
	%>
	<% int result=add(10,15); %>
	덧셈 결과 1 : <%= result %>
	<br>덧셈 결과 2 : <%= add(50,55) %>
</body>
</html>