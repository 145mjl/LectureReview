<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="utils.CookieBox" %>

<%
	CookieBox cookieBox=new CookieBox(request);

	String saveId=cookieBox.exists("uId")? cookieBox.getValue("uId"):"";
	String checked=cookieBox.exists("uid")? "checked" : "";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 로그인</h1>
	<hr>
	<form action="loginResult.jsp" method="get"></form>
	
		<table>
			<tr>
				<th><label for="userid">아이디</label></th>
				<td><input type="text" id="userid" name="userid" value="<%= saveId%>"></td>
			</tr>
			<tr>
				<th><label for="pw">비밀번호</label></th>
				<td><input type="password" id="pw" name="pw"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="checkbox" name="chk" value="on" <%=checked %>>아이디 저장</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="로그인"></td>
			</tr>
		</table>
</body>
</html>