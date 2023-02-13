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
	
	<h3>choose 태그로 홀짝 판단하기</h3>
	<c:choose>
		<c:when test="${number mod 2 eq 0 }">
			${ number }는 짝수입니다.
		</c:when>
		<c:otherwise>
			${ number }는 홀수입니다.
		</c:otherwise>
	</c:choose>
	
	<h3>국,영,수 점수를 입력하면 평균을 내어 학점 출력</h3>
	<form>
		국어 : <input type="text" name="kor" />
		영어 : <input type="text" name="eng" />
		수학 : <input type="text" name="math" />
		<input type="submit" value="학점 구하기" />
	</form>
	
	<c:if test="${not (empty param.kor or empty param.eng or empty param.math)}">
	<%-- <c:if test="${!(param.kor==null or param.eng==null or param.math==null)}"> 으로 작성하면 비어있는 값을 인식하지 못함--%>
		<c:set var="avg" value="${(param.kor+param.eng+param.math)/3 }" />
		평균 점수는 ${avg }으로
		<c:choose>
			<c:when test="${avg >=90 }">A 학점</c:when>
			<c:when test="${avg >=80 }">B 학점</c:when>
			<c:when test="${avg >=70 }">C 학점</c:when>
			<c:when test="${avg >=60 }">D 학점</c:when>
			<c:otherwise>F 학점</c:otherwise>
		</c:choose>
		입니다.
	</c:if>
	
</body>
</html>