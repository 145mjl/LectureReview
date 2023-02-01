<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	out.print("출력되지 않는 텍스트");//버퍼에 문자열 저장
	out.clearBuffer();//버퍼를 (저장된 내용을 출력하지 않고) 비움
	out.print("<h2>out 내장 객체</h2>");
	
	out.print("출력 버퍼의 크기 : "+out.getBufferSize()+"<br>");
	out.print("남은 버퍼의 크기 : "+out.getRemaining()+"<br>");
	
	//버퍼는 모두 채워졌을 때 flush되면서 내용을 출력하지만, flush()메서드를 사용하여 강제로 출력시킬수 있다
	out.flush();
	out.print("flush 후 버퍼의 크기 : "+out.getRemaining()+"<br>");
	
	//다양한 타입의 값 출력
	out.print(1);
	out.print(false);
	out.print('가');
	//맨 아래 값들이 버퍼를 모두 채우지 않았는데도 출력되는 것은 버퍼가 닫히기 전에 자동으로 flush()하기 때문으로 추정
	%>
</body>
</html>