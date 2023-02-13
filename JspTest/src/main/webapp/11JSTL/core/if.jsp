<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="number" value="100" />
	<c:set var="string" value="JSP" />
	
	<h3>JSTL if 태그 - odd , even</h3>
	<c:if test="${number mod 2 eq 0 }" var="result" >
		${number }은 짝수입니다</br> 
	</c:if>
	result : <c:out value="${result }" />
	
	<h3>문자열 비교와 else 구문 흉내내기</h3>
	<c:if test="${string eq 'Java' }" var="result2" >
		문자열은 Java입니다.</br>
	</c:if>
	result : <c:out value="${result2 }" />
	
	<h3>조건식 주의사항</h3>
	
	<div>
		<c:if test="100" var="result3">
			test에 EL으로 된 조건식을 작성하지 않은 경우 false<br/>
		</c:if>
		result3 : <c:out value="${result3 }" />
	</div>
	<div>
		<c:if test="tRuE" var="result4">
			test=tRuE 작성시 <br/>
		</c:if>
		result4 : <c:out value="${result4 }" />
	</div>
	<div>
		<c:if test=" ${ true }" var="result5">
			test식에서 EL외부에 빈 공백이 있는 경우 <br/>
		</c:if>
		result5 : <c:out value="${result5 }" />
	</div>
	
</body>
</html>