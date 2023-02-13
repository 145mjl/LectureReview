<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <% request.setCharacterEncoding("UTF-8"); %> --%>
	<jsp:useBean class="common.Person" id="person"/>
	<jsp:setProperty property="*" name="person"/>
	
	<ul>
		<li><jsp:getProperty property="name" name="person"/></li>
		<li><jsp:getProperty property="age" name="person"/></li>
	
	</ul>
</body>
</html>