<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function validateForm(form){
		if(form.pass.value==''){
			alert("비밀번호를 입력하세요.");
			form.pass.focus();
			return false;
		}
	}
</script>
<body>
	<h3>파일 첨부형 게시판 - 비밀번호 검증(pass)</h3>
	<form name="writeFrm" method="post"	action="../mvcboard/pass.do" 
	onsubmit="return validateForm(this);">
	<!-- action에 넣을 경로 주의
	서블릿파일 기준 /mvcboard/pass.do는 webapp/mvcboard/pass.do
	따라서 pass.jsp기준 ../붙어야함 -->
	<input type="hidden" name="idx" value="${param.idx }" />	
	<input type="hidden" name="mode" value="${param.mode }" />	
	<table border="1" style="width:90%">
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="password" name="pass" style="width:100px" />
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="submit">검증하기</button>
				<button type="reset">RESET</button>
				<button type="button" onclick="location.href='../mvcboard/list.do';">
					글 목록으로
				</button>
			</td>
		</tr>
	
	</table>
	</form>
</body>
</html>