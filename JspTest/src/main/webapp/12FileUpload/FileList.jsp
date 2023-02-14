<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.List" %>
<%@ page import="fileupload.MyfileDAO" %>
<%@ page import="fileupload.MyfileDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>DB에 등록된 파일 목록 출력</h3>
	<%	
		MyfileDAO dao=new MyfileDAO();
		List<MyfileDTO> fileLists=dao.myFileList();
		dao.close();
	%>
	<% for (MyfileDTO f:fileLists){%>
	<%= f.getIdx() %><br>
	<%= f.getName() %><br>
	<%= f.getTitle() %><br>
	<%= f.getCate() %><br>
	<%= f.getOfile() %><br>
	<%= f.getSfile() %><br>
	<%= f.getPostdate() %><br>
	<a href="Download.jsp?oName=<%=URLEncoder.encode(f.getOfile(),"UTF-8")%>&sName=<%=URLEncoder.encode(f.getSfile(),"UTF-8")%>">
		다운로드
	</a><br>
	<% } %>
</body>
</html>