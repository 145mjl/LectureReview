<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL - empty 연산자</h3>
	<%
		pageContext.setAttribute("num1",9);
		pageContext.setAttribute("num2","10");
		pageContext.setAttribute("nullStr", null);
		pageContext.setAttribute("emptyStr", "");
		pageContext.setAttribute("arrayLengthZero", new Object[0]);
		pageContext.setAttribute("collectionSizeZero",new ArrayList<Integer>());
	%>
	<div>
		empty nullStr : ${ empty nullStr }<br>
		empty emptyStr : ${ empty emptyStr }<br>
		empty arrayLengthZero : ${ empty arrayLengthZero }<br>
		empty collectionSizeZero : ${ empty collectionSizeZero }<br>
	</div>
	
	<h3>null을 연산에 사용할 경우</h3>
	<div>
		num1+nullStr : ${num1+nullStr }<br>
		num2*emptyStr : ${num2+emptyStr }<br>
		param.noVar > 10 : ${param.noVar>10 }
	</div>
	
	<h3>삼항 연산자</h3>
	num1 gt num2? : ${num1 gt num2? "num1이 큼":"num2가 큼" }
</body>
</html>