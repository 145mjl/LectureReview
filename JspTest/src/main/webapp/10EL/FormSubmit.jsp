<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Form</h2>
	<form action="FormResult.jsp" method="post" name="frm">
		이름 : <input type="text" name="name"><br>
		성별 : <input type="radio" name="gender" value="woman"/>여자
			<input type="radio" name="gender" value="man"/>남자<br>
		학력 : 
			<select name="grade">
				<option value="ele">초딩</option>
				<option value="mid">중딩</option>
				<option value="high">고딩</option>
				<option value="uni">대딩</option>
			</select><br>
		
		관심사항 : 
			<input type="checkbox" name="interest" value="pol"/>정치
			<input type="checkbox" name="interest" value="ent"/>연예
			<input type="checkbox" name="interest" value="spo"/>스포츠
			<input type="checkbox" name="interest" value="eco"/>경제<br>
		
		<input type="submit" value="전송하기" />
	</form>
</body>
</html>