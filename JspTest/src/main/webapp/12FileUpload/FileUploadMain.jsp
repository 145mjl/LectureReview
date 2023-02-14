<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function validateForm(form){
		if(form.name.value==''){
			alert("작성자를 입력하세요.");
			form.name.focus();
			return false;
		}
		if(form.title.value==''){
			alert("제목을 입력하세요.");
			form.title.focus();
			return false;
		}
		if(form.attachedFile.value==''){
			alert("첨부파일은 필수 입력사항입니다.");
			form.attachedFile.focus();
			return false;
		}
	}
</script>

<body>
	<h3>파일 업로드</h3>
	<div>
		<div>${errorMessage }</div>
	<!-- enctype 속성값
	폼 데이터가 서버로 제출될 때 해당 데이터가 인코딩되는 방법을 명시합니다.
	이 속성은 method가 post일때만 사용가능합니다.
	application/x-www-form-urlencoded : 기본값으로, 모든 문자들은 서버로 보내기 전에 인코딩됨을 명시함.
	multipart/form-data : 모든 문자를 인코딩하지 않음을 명시함. 
	이 방식은 <form> 요소가 파일이나 이미지를 서버로 전송할 때 주로 사용함.
	 -->
	<form name="fileForm" method="post" enctype="multipart/form-data" 
	action="UploadProcess.jsp" onsubmit="return validateForm(this);">
		작성자 : <input type="text" name="name" value="mustHave"/><br>
		제목 : <input type="text" name="title"/><br>
		카테고리(선택사항) : 
			<input type="checkbox" name="cate" value="사진" />사진<br>
			<input type="checkbox" name="cate" value="과제" />과제<br>
			<input type="checkbox" name="cate" value="워드" />워드<br>
			<input type="checkbox" name="cate" value="음원" />음원<br>
		첨부파일 : 
			<input type="file" name="attachedFile" /><br>	
		<input type="submit" value="전송하기" /><br>	
	</form>
	</div>
</body>
</html>