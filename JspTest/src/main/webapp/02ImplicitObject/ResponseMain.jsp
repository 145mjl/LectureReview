<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 로그인폼</h2>
	<%
	String loginErr=request.getParameter("loginErr");
	if(loginErr!=null)out.print("로그인 실패");
	%>
	<form action="./ResponseLogin.jsp" method="post">
		아이디 : <input type="text" name="user_id"><br/>
		비밀번호 : <input type="password" name="user_pw"><br/>
		<input type="submit" name="로그인">
	</form>
	
	<h2>2. HTTP 응답헤더</h2>
	<form action="./ResponseHeader.jsp" method="post">
		날짜 형식 : <input type="text" name="add_date" value="2021-10-25 09:00" ><br/>
		숫자 형식 : <input type="text" name="add_int" value="8282"><br>
		문자 형식 : <input type="text" name="add_str" value="홍길동"><br>
		<input type="submit" value="응답 헤더 설정 & 출력"/>
	</form>
	
	이 파일을 실행하세요. 
	따로따로 점검한다고 ResponseHeader 예제 파일을 실행할 경우, 
	넘어오는 변수가 없기 때문에 에러가 발생합니다.
</body>
</html>

