<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="membership.MemberDTO" %>
<%@ page import="membership.MemberDAO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userId=request.getParameter("user_id");
	String userPwd=request.getParameter("user_pw");
	
	String driver=application.getInitParameter("OracleDriver");
	String url=application.getInitParameter("OracleURL");
	String id=application.getInitParameter("OracleID");
	String pwd=application.getInitParameter("OraclePwd");
	
	MemberDAO dao=new MemberDAO(driver,url,id,pwd);
	MemberDTO dto=dao.getMemberDTO(userId, userPwd);
	dao.close();
	
	if(dto.getId()!=null){
		session.setAttribute("UserId",dto.getId());
		session.setAttribute("UserName",dto.getName());
		response.sendRedirect("LoginForm.jsp");
	}else{//로그인실패
		request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	}
	%>
</body>
</html>