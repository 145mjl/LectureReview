<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% response.setContentType("UTF-8"); %>
	
	<h2>Form Result</h2>
	<div>
		<ul>
			<li>이름 : ${ param.name }</li>
			<li>성별 : ${ param.gender }</li>
			<li>학력 : ${ param.grade }</li>
			<li>관심사항 : 
				<ul>
					<li>${ paramValues.interest[0] }</li>
					<li>${ paramValues.interest[1] }</li>
					<li>${ paramValues.interest[2] }</li>
					<li>${ paramValues.interest[3] }</li>
				</ul>
			</li>
		</ul>
		
	</div>
</body>
</html>