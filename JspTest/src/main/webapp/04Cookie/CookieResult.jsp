<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>쿠키 확인하기(쿠키 생성 이후 페이지)</h2>
<%
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie c:cookies){
		out.println("쿠키명 : "+c.getName()+" , 쿠키값 : "+c.getValue()+"<br>");
	}
}
%>
</body>
</html>