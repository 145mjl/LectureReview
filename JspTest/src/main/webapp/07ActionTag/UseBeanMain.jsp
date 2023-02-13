<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>액션태그 UseBean</h2>
	<h3>액션태그 사용하여 자바빈즈 생성</h3>
	<jsp:useBean id="person" class="common.Person" scope="request" />
	
	<h3>자바빈즈 속성 지정</h3>
	<jsp:setProperty property="name" name="person" value="임꺽정"/>
	<jsp:setProperty property="age" name="person" value="41"/>
	
	<h3>자바빈즈 속성 읽기</h3>
		<ul>
			<li><jsp:getProperty name="person" property="name"/></li>
			<li><jsp:getProperty name="person" property="age"/></li>
		</ul>
</body>
</html>