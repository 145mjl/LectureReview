package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

// new → servlet → URL Mapping 을 /login.do로 수정 → 생성자 생성옵션은 체크 해제, doGet,doPost에 체크 → Finish

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=request.getRequestDispatcher("member/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="member/login.jsp";
		String userid=request.getParameter("userid");
		String pwd=request.getParameter("pwd");
		
		MemberDAO mDao=MemberDAO.getInstance();
		int result=mDao.userCheck(userid, pwd);
		if(result==1) {
			MemberVO mVo=mDao.getMember(userid);
			HttpSession session=request.getSession();
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "회원가입에 성공했습니다.");
			url="main.jsp";
		}else if(result==0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다");
		}else if(result==-1) {
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}

		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
