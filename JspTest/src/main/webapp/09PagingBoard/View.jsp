<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model1.board.*" %>

<%
String num=request.getParameter("num");

BoardDAO dao=new BoardDAO(application);
dao.updateVisitCount(num);
BoardDTO dto=dao.selectView(num);
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function deletePost(){
	var confirmed=confirm("정말로 삭제하겠습니까?");
	if(confirmed){
		var form=document.WriteFrm;
		/* document 뒤에 오는 것은 form name으로, 대소문자에 주의한다. */
		form.method="post";
		form.action="DeleteProcess.jsp";
		form.submit();
	}
}
</script>
</head>
<body>
<jsp:include page="../Common/Link.jsp" />
<h2>회원제 게시판 - 상세 보기 (View)</h2>
<form name="WriteFrm">
	<!-- DeleteProcess.jsp에 param으로 전달됨. 
	이 부분을 빼먹을 시 param이 전달되지 않으므로 DeleteProcess.jsp파일에서 변수 초기화부터 문제 생김-->
	<input type="hidden" name="num" value="<%= num %>"/>
	<table border="1" width="90%">
		<tr>
			<td>번호</td>
			<td><%=dto.getNum() %></td>
			<td>작성자</td>
			<td><%=dto.getName() %></td>
		</tr>
		<tr>
			<td>작성일</td>
			<td><%=dto.getPostdate() %></td>
			<td>조회수</td>
			<td><%=dto.getVisitcount() %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="3"><%=dto.getTitle() %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3" height="100">
				<%=dto.getContent().replace("\r\n", "<br>") %>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<%if(session.getAttribute("UserId")!=null
					&& session.getAttribute("UserId").toString()
						.equals(dto.getId())){ 
						
						%>
				<button type="button" onclick="location.href='Edit.jsp?num=<%=dto.getNum()%>';">
					수정하기
				</button>
				<!-- javascript 함수를 onclick에 지정할 때 세미콜론으로 끝내야함 -->
				<button type="button" onclick="deletePost();">
					삭제하기
				</button>
				<%} %>
				<button type="button" onclick="location.href='List.jsp';">
					목록 보기
				</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>