package model2.mvcboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import fileupload.FileUtil;
import utils.JSFunction;

public class WriteController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//** forward하지 않을 시 현재 서블릿파일이 mapping된 url로 이동하더라도 아무것도 뜨지 않는다
		req.getRequestDispatcher("/14MVCBoard/write.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String saveDirectory=req.getServletContext().getRealPath("/Uploads");
		ServletContext application=getServletContext();
		int maxPostSize=Integer.parseInt(application.getInitParameter("maxPostSize"));
		
		MultipartRequest mr=FileUtil.uploadFile(req, saveDirectory, maxPostSize);
		if(mr==null) {
			JSFunction.alertLocation(resp,"첨부 파일이 제한 용량을 초과합니다.", "../mvcboard/write.do");
			return;
		}
		
		//DTO객체생성하여 MultipartRequest mr객체값 가져와서 넣기
		//MultipartRequest는 그럼 값을 어디서 받았나? -> View의 form에서
		MVCBoardDTO dto=new MVCBoardDTO();
		dto.setName(mr.getParameter("name"));
		dto.setTitle(mr.getParameter("title"));
		dto.setContent(mr.getParameter("content"));
		dto.setPass(mr.getParameter("pass"));
		
		//원본파일과 (saveDirectory에) 저장된 파일 이름 설정
		String fileName=mr.getFilesystemName("ofile");//여기서 오타를 내서 db에 안 올라감
		if(fileName!=null) {
			String ext=fileName.substring(fileName.lastIndexOf("."));
			String now=new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			/* saveDirectory에서 now+ext로 파일명이 바뀐것을 확인할 수 있다. */
			String newFileName=now+ext;
			
			File oldFile=new File(saveDirectory+File.separator+fileName);
			File newFile=new File(saveDirectory+File.separator+newFileName);
			oldFile.renameTo(newFile);
			
			dto.setOfile(fileName);
			dto.setSfile(newFileName);
		}
		
		//Ofile,Sfile 값도 담았으므로 이제 DAO를 통해 DB에 insert
		MVCBoardDAO dao=new MVCBoardDAO();
		int result=dao.insertWrite(dto);
		dao.close();
		
		if(result==1) {
			resp.sendRedirect("../mvcboard/list.do");
		}else {
			resp.sendRedirect("../mvcboard/write.do");
		}
		dao.close();
	}
}
