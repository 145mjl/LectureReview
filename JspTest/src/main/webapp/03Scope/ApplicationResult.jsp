<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Map" %>
    <%@ page import="java.util.Set" %>
    <%@ page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>application 영역의 속성 읽기</h2>
	
	<%
	Map<String,Person> maps=(Map<String,Person>)application.getAttribute("maps");
	Set<String> keys=maps.keySet();
	for(String key: keys){
		Person person=maps.get(key);
		out.print("이름 : "+person.getName()+", 나이 : "+person.getAge()+"<br>");
	}
	%>
</body>
</html>