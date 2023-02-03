<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="utils.CookieBox" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userId=request.getParameter("userId");
	String pass=request.getParameter("pw");
	String chk=request.getParameter("chk");
	
	if(chk!=null && chk.equals("on")&&userId!=null && !userId.isEmpty()){
		//쿠키를 생성하고 저장
		response.addCookie(CookieBox.createCookie("uId", "userId", "/", 60*60*24*365));
	}else{
		response.addCookie(CookieBox.createCookie("uId",userId,"/",0));
	}
	%>
</body>
</html>