<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>List Collection</h3>
	<div>
		<%
			List<Object> aList=new ArrayList<Object>();
			aList.add("청해진");
			aList.add(new Person("장보고",28));
			pageContext.setAttribute("Ocean", aList);
		%>
		<ul>
			<li>0번째 요소 : ${Ocean[0] }</li>
			<li>1번째 요소 : ${Ocean[1].name } , ${Ocean[1].age }</li>
			<li>2번째 요소 : ${Ocean[2] }</li> <!-- 출력되지 않는다 -->
		</ul>
	</div>
	<h3>Map Collection</h3>
	<div>
		<%
			Map<String,String> map=new HashMap<String,String>();
			map.put("한글","훈민정음");
			map.put("eng","English");
			pageContext.setAttribute("Lang", map);
		%>
		<ul>
			<li>한글 value : ${Lang["한글"]} ,<!-- 한글은 다음 표기법은 사용 불가 --> <%--${Lang.한글 }--%> ${Lang['한글'] }</li>
			<li>eng value : ${Lang["eng"]} , ${Lang.eng } , ${Lang['eng'] }</li>
		</ul>
	</div>
</body>
</html>