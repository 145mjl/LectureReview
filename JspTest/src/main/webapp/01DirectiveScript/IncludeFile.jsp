<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="IncludedFile.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println("오늘 날짜 : "+today);//include 지시어를 이용하여 포함시킨 파일의 변수를 사용한다.
	out.println("<br/>");
	out.println("내일 날짜 : "+tomorrow);
	%>
</body>
</html>