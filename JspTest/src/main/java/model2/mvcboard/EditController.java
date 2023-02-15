package model2.mvcboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import fileupload.FileUtil;
import utils.JSFunction;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/mvcboard/edit.do")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idx=request.getParameter("idx");
		MVCBoardDAO dao=new MVCBoardDAO();
		MVCBoardDTO dto=dao.selectView(idx);
		request.setAttribute("dto",dto);
		request.getRequestDispatcher("/14MVCBoard/edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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

		MVCBoardDTO dto=new MVCBoardDTO();
		//mr은 req을 param으로 받았기 때문에 이렇게 해도 dto 관련값을 가져올 수 있음 
		dto.setIdx(mr.getParameter("idx"));
		dto.setName(mr.getParameter("name"));
		dto.setTitle(mr.getParameter("title"));
		dto.setContent(mr.getParameter("content"));
		
		
		//비밀번호는 session에서 가져옴
		//예제코드 그대로 따라치면 edit창에서 비밀번호 수정해도 안 되는게 맞음
		HttpSession session=req.getSession();
		String pass=(String)session.getAttribute("pass");
		dto.setPass(pass);
		
		//이전 파일(edit.jsp참고)
		String prevOfile=mr.getParameter("prevOfile");
		String prevSfile=mr.getParameter("prevSfile");
		
		//새 파일
		String fileName=mr.getFilesystemName("ofile");
		
		if(fileName!=null) {
			//새 파일이름 생성
			String ext=fileName.substring(fileName.lastIndexOf("."));
			String now=new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			String newFileName=now+ext;
			
			//파일명 변경
			File oldFile=new File(saveDirectory+File.separator+fileName);
			File newFile=new File(saveDirectory+File.separator+newFileName);
			oldFile.renameTo(newFile);
			
			//dto에 저장
			dto.setOfile(fileName);
			dto.setSfile(newFileName);
			
			//기존파일 삭제
			FileUtil.deleteFile(req, "/Uploads", prevSfile);
		}else {
			//첨부파일이 없으면 기존 이름 유지
			dto.setOfile(prevOfile);
			dto.setSfile(prevSfile);
		}//이제 dto 세팅 완료
		
		MVCBoardDAO dao=new MVCBoardDAO();
		int result=dao.updatePost(dto);
		dao.close();
		
		if(result==1) {
			session.removeAttribute("pass");
			resp.sendRedirect("../mvcboard/list.do");
		}else {
			JSFunction.alertLocation(resp, "비밀번호 검증을 다시 진행해주세요.", 
									"../mvcboard/view.do?idx="+mr.getParameter("idx"));
		}
		
	}

}
