<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.HashMap" %>
    <%@ page import="java.util.Map" %>
    <%@ page import="model1.board.BoardDAO" %>
    <%@ page import="model1.board.BoardDTO" %>
    
    <%
    BoardDAO dao=new BoardDAO(application);
    
    Map<String,Object> param=new HashMap<String,Object>();
    String searchField=request.getParameter("searchField");
    String searchWord=request.getParameter("searchWord");
    if(searchWord!=null){
    	param.put("searchField", searchField);
    	param.put("searchWord",searchWord);
    }
    
    int totalCount=dao.selectCount(param);
    List<BoardDTO> boardLists=dao.selectList(param);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />
	<h2>목록 보기(List)</h2>
	<!-- 검색폼 -->
	<form method="get">
	<table border="1" width="90%">
	<tr>
		<td align="center">
			<select name="searchField">
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="text" name="searchWord" />
			<input type="submit" value="검색하기" />
	</table>
	</form>
	
	<table border="1" width="90%">
	<!-- 각 컬럼의 이름 -->
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
	
	<%
	if(boardLists.isEmpty()){
	%>
		<tr>
			<td colspan="5" align="center">
			등록된 게시물이 없습니다.
			</td>
		</tr>
	<%	
	}else{
		int virtualNum=0;
		for(BoardDTO dto : boardLists){
			virtualNum=totalCount--;
	%>
		<tr align="center">
			<td><%= virtualNum %></td>
			<td align="left">
				<a href="View.jsp?num=<%= dto.getNum() %>">
					<%= dto.getTitle() %>
				</a>
			</td>
			<td align="center"><%=dto.getId() %></td>
			<td align="center"><%=dto.getVisitcount() %></td>
			<td align="center"><%=dto.getPostdate() %></td>
		</tr>
	<%
		}
	}
	%>
	</table>
	<table>
		<tr>
			<td>
				<button type="button" onclick="location.href='Write.jsp';">
					글쓰기
				</button>
			</td>
		</tr>
	</table>
</body>
</html>