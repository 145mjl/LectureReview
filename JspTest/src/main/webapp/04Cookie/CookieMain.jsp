<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>쿠키 설정</h2>

<%
Cookie cookie=new Cookie("myCookie","쿠키값");
cookie.setPath(request.getContextPath());
cookie.setMaxAge(3600);
response.addCookie(cookie);
%>
<h2>쿠키 설정 직후 쿠키값 확인하기</h2>
<%
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie c:cookies){
		out.println(c.getName()+" : "+c.getValue()+"<br>");
	}
}
%>
<h2>페이지 이동 후 쿠키값 확인하기</h2>
<a href="CookieResult.jsp">다음 페이지에서 쿠키값 확인하기</a>
<br/>
<a href="DeleteCookieTest.jsp">쿠키 삭제하기</a>
</body>
</html>