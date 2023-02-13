<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="common.Person" scope="request" />
	<h2>포워드 된 페이지에서 매개변수 확인</h2>
	이름 : <jsp:getProperty property="name" name="person"/><br>
	나이 : <jsp:getProperty property="age" name="person"/><br>
	본명 : <%= request.getParameter("param1") %><br>
	출생 : <%= request.getParameter("param2") %><br>
	직업 : <%= request.getParameter("param3") %><br>
	
	<jsp:include page="ParamInclude.jsp">
		<jsp:param value="강원도 영월" name="loc1"/>
		<jsp:param value="김삿갓면" name="loc2"/>
	</jsp:include>	
	
</body>
</html>