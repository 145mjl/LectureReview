<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>쿠키 key:myCookie의 값이 삭제되었습니다.</h2>
<%
Cookie[] cookies = request.getCookies(); //client에서 쿠키를 받아옴

if(cookies!=null){
    for(int i=0;i<cookies.length;i++){
        if(cookies[i].getName().equals("cookieName")){
        	// 쿠키 유지시간은 0으로 설정
            cookies[i].setMaxAge(0);
            // 변경된 쿠기 정보를 다시 클라이언트에 전달
            response.addCookie(cookies[i]);
        }
    }
}
%>
<a href="CookieResult.jsp">쿠키 삭제 확인하기</a>
</body>
</html>