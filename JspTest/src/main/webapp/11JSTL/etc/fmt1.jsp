<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>숫자 포맷 설정 fmt:formatNumber 태그</h3>
	<c:set var="number1" value="12345"/>
	<div>
		<h4>기본</h4>
		<fmt:formatNumber value="${number1 }"/><br>
		<h4>groupingUsed=" false "</h4>
		<fmt:formatNumber value="${number1 }" groupingUsed="false"/>
	</div>
	<div>
		<h4>type="currency"</h4>
		<fmt:formatNumber value="${number1 }" type="currency" var="printNum1"/>
		${printNum1 }
	</div>
	<div>
		<h4>type="percent"</h4>
		<fmt:formatNumber value="${number1 }" type="percent" var="printNum2"/>
		<c:out value="${printNum2}" />
	</div>
	<h3>문자열을 숫자로 fmt:parseNumber 태그 </h3>
	<c:set var="number2" value="15493.74" />
	<div>
		<h4>pattern = " 00,000.00 " </h4>
		<fmt:parseNumber value="${number2 }" pattern="00,000.00" var="printNum3"/>
		${printNum3 }
		<h4>integerOnly="true"</h4>
		<fmt:parseNumber value="${number2 }" integerOnly="true" var="printNum4"/>
		${printNum4 }
	</div>
</body>
</html>