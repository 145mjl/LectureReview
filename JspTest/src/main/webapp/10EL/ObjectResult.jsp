<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>영역을 통해 전달된 객체 읽기</h2>
		<ul>
			<li>${ personObj.name}, ${personObj.age}</li>
			<li>${requestScope.stringObj}</li>
			<li>${integerObj}</li>
		</ul>

	<h2>매개변수를 통해 전달된 객체 읽기</h2>
		<ul>
			<li>${param.firstNum + param['secondNum'] }</li>
			<li>${param.firstNum }+ ${param["secondNum"]}</li>
		</ul>
</body>
</html>