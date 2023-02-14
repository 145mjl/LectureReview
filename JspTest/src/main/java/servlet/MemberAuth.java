package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import membership.MemberDAO;
import membership.MemberDTO;

/**
 * Servlet implementation class MemberAuth
 */
public class MemberAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	MemberDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	ServletContext application=this.getServletContext();
    	String driver=application.getInitParameter("OracleDriver");
    	String connectUrl=application.getInitParameter("OracleURL");
    	String oId=application.getInitParameter("OracleID");
    	String oPass=application.getInitParameter("OraclePwd");
    	
    	dao=new MemberDAO(driver, connectUrl, oId, oPass);
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	String admin_id=this.getInitParameter("admin_id");
    	String id=req.getParameter("id");
    	String pass=req.getParameter("pass");
    	
    	MemberDTO memberDTO=dao.getMemberDTO(id, pass);
    	
    	String memberName=memberDTO.getName();
    	if(memberName!=null) {
    		req.setAttribute("authMessage", memberName+"님 안녕하세요");
    	}else {
    		if(admin_id.equals(id)) {
    			req.setAttribute("authMessage", admin_id+"는 관리자입니다.");
    		}else {
    			req.setAttribute("authMessage", "아이디가 틀렸거나 존재하지 않습니다.");
    		}
    	}
    	req.getRequestDispatcher("/13Servlet/MemberAuth.jsp").forward(req, resp);
    }
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	dao.close();
    }
}
