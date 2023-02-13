<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="utils.CookieManager" %>
<%
	CookieManager.makeCookie(response,"ELCookie","EL좋아요",10);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠기값 읽기</h3>
	<div>
	ELCookie값 : ${ cookie.ELCookie.value }
	</div>
	
	<h3>HTTP 헤더 읽기</h3>
	<div>
		<ul>
			<li>host : ${header.host }</li>
			<li>user-agent : ${header["user-agent"]}</li>
			<li>cookie : ${header.cookie }</li>
		</ul>
	</div>
	
	<h3>컨텐스트 초기화 매개변수 읽기</h3>
	<div>
		OracleDriver : ${initParam.OracleDriver }
	</div>
	
	<h3>Context Root Path</h3>
	<div>
		${pageContext.request.contextPath}
	</div>
</body>
</html>