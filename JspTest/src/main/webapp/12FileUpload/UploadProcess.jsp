<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fileupload.MyfileDAO" %>
<%@ page import="fileupload.MyfileDTO" %>
<%@ page import="java.io.File" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- saveDirectory를 만들어주지 않은 경우 다음과 같은 에러 발생
java.lang.IllegalArgumentException: Not a directory: D:\java221025\javaworkspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JspTest\Uploads
 -->
	<%
		String saveDirectory=application.getRealPath("/Uploads");
		int maxPostSize=1024*1000;//1MB까지만
		String encoding="UTF-8";
		
		try{
			MultipartRequest mr=new MultipartRequest(request,saveDirectory,
					maxPostSize,encoding);
			
			String fileName=mr.getFilesystemName("attachedFile");
			String ext=fileName.substring(fileName.lastIndexOf("."));
			String now=new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			/* saveDirectory에서 now+ext로 파일명이 바뀐것을 확인할 수 있다. */
			String newFileName=now+ext;
			
			File oldFile=new File(saveDirectory+File.separator+fileName);
			File newFile=new File(saveDirectory+File.separator+newFileName);
			oldFile.renameTo(newFile);
			
			/* String name은 DB에 올라가는 정보이며, 세이브디렉토리의 파일명은 아니다. */
			String name=mr.getParameter("name");
			String title=mr.getParameter("title");
			String[] cateArray=mr.getParameterValues("cate");
			StringBuffer cateBuf=new StringBuffer();
			if(cateArray==null){
				cateBuf.append("선택 없음");
			}else{
				for(String s:cateArray){
					cateBuf.append(s+", ");
				}
			}
			
			MyfileDTO dto=new MyfileDTO();
			dto.setName(name);
			dto.setTitle(title);
			dto.setCate(cateBuf.toString());
			dto.setOfile(fileName);
			dto.setSfile(newFileName);
			
			MyfileDAO dao=new MyfileDAO();
			dao.insertFile(dto);
			
			response.sendRedirect("FileList.jsp");
			
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("errorMessage", "파일 업로드 오류");
			request.getRequestDispatcher("FileUploadMain.jsp").forward(request, response);
			//예외발생시 FileUploadMain의 ${errorMessage}로 해당값을 전달한다.
		}
	%>
</body>
</html>