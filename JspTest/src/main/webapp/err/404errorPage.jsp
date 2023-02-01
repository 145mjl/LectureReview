<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %>
    <% response.setStatus(200); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../resources/bootstrap.css" type="text/css">
<!-- 상대경로
현재 폴더는 ./ 로 표현하며 생략 가능하다
따라서 ./resources/bootstrap.css로 경로를 지정하면 err폴더 하위에서 찾는다
../로 작성하여야 제대로 찾아간다. -->

</head>
<body>
	<h1 align="center">HTTP 404<br></h1>
	<div align="center">
	요청하신 페이지를 찾을 수 없습니다.
	</div>
<div class="alert alert-danger d-flex align-items-center" role="alert">
  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-exclamation-triangle-fill" viewBox="0 0 16 16">
  <path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
	</svg>
  <div>
    An example danger alert with an icon
  </div>
</div>
</body>
</html>