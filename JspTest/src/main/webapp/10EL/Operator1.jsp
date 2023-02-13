<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num1=3;
	pageContext.setAttribute("num2", 4);
	pageContext.setAttribute("num3", 7);
	pageContext.setAttribute("num4", 12);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL 연산자</h3>
	<div>
		num1은 스크립틀릿에서 선언, 그외는 page영역에 저장됨
		num1= ${num1 } ,
		num2= ${num2 } ,
		num3= ${num3 } ,
		num4= ${num4 }
	</div>
	<h4>변수 할당과 동시에 출력(num1을 7로)</h4>
	<div>
		${num1=7 }
	</div>
	<h4>변수 할당 및 별도 출력(num2를 8로)</h4>
	<div>
		${num2=8;'' } ${num2 }
	</div>
	
	<h3>산술 연산자</h3>
	<div>
		num1+num2 : ${num1+num2 } <br/>
		num1-num2 : ${num1-num2 } <br/>
		num1*num2 : ${num1*num2 } <br/>
		num1/num2 : ${num1/num2 } <br/>
		num1 div num2 : ${num1 div num2 } <br/>
		num1%num2 : ${num1%num2 } <br/>
		num1 mod num2 : ${num1 mod num2 } <br/>
	</div>
	
	<h3>비교 연산자</h3>
	<div>
		num4 > num3 : ${num4 gt num3 }<br>
		num4 > num3 : ${num4 lt num3 }<br>
		num4 > num3 : ${num4 ge num3 }<br>
		num4 > num3 : ${num4 eq num3 }<br>
	</div>
	
	<h3>논리 연산자</h3>
	<div>
		num3 <= num4 : ${num3 le num4}<br> <!-- less than or equal -->
		num3 >= num4 : ${num3 ge num4}<br> <!-- greater than or equal -->
		num3 <= num4 && num3 == num4 : ${num3 le num4 and num3 eq num4 }<br>
		num3 >= num4 || num3 != num4 : ${num3 ge num4 or num3 ne num4 }
	</div>
</body>
</html>