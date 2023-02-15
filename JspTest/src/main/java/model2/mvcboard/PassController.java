package model2.mvcboard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fileupload.FileUtil;
import utils.JSFunction;

/**
 * Servlet implementation class PassController
 */
@WebServlet("/mvcboard/pass.do")
public class PassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//view.jsp 맨 아래쪽 a href태그를 보면, 수정 및 삭제버튼에서 다음 속성값을 확인할 수 있다.
		//../mvcboard/pass.do?mode=edit&idx=${param.idx}
		//../mvcboard/pass.do?mode=delete&idx=${param.idx}
		//즉 이 버튼들을 누르면 pass.do에 2개의 인자가 함께 전달이 되고, 매핑된 현재 서블릿파일이 실행되며 doGet메서드가 호출된다.
		//pass.jsp를 forward한다
		//결과적으로 버튼을 누르면 pass.jsp에서 설정한 view가 보임
		request.setAttribute("mode", request.getParameter("mode"));
		request.getRequestDispatcher("/14MVCBoard/pass.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//pass.jsp에 작성한 form(post 방식)이 값을 제출하면 doPost()가 호출된다
		//비밀번호 확인 후, 수정 또는 삭제(param mode의 값에 따름)한다
		
		String idx=req.getParameter("idx");
		String mode=req.getParameter("mode");
		String pass=req.getParameter("pass");
		
		MVCBoardDAO dao=new MVCBoardDAO();
		boolean confirmed=dao.confirmPassword(pass, idx);
		dao.close();
		
		if(confirmed) {
			if(mode.equals("edit")) {//수정버튼 눌렀을 때
				HttpSession session=req.getSession();
				session.setAttribute("pass", pass);
				//수정은 다른 컨트롤러에게 맡김
				resp.sendRedirect("../mvcboard/edit.do?idx="+idx);
			}else if(mode.equals("delete")) {//삭제버튼 눌렀을 때
				//삭제는 여기서
				dao=new MVCBoardDAO();
				//실수로 dto객체를 new로 생성했다가, dao.selectView(idx)로 주소를 바꾸는 코드를 작성했음
				//이것을 고치기 전에는 제대로 작동되지 않았음
				MVCBoardDTO dto=dao.selectView(idx);
				int result=dao.deletePost(idx);
				dao.close();
				if(result==1) {
					String saveFileName=dto.getSfile();
					FileUtil.deleteFile(req, "Uploads", saveFileName);
				}
				JSFunction.alertLocation(resp, "삭제되었습니다.", "../mvcboard/list.do");
			}
		}else {
			JSFunction.alertBack(resp, "비밀번호 검증에 실패하였습니다.");
		}
		
	}


}
