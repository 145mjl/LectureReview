package model2.mvcboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.BoardPage;

/**
 * Servlet implementation class ListController
 */
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MVCBoardDAO dao=new MVCBoardDAO();
		
		Map<String,Object> map=new HashMap<String,Object>();
		
		String searchField=request.getParameter("searchField");
		String searchWord=request.getParameter("searchWord");
		if(searchWord!=null) {
			map.put("searchField", searchField);
			map.put("searchWord", searchWord);
		}
		
		int totalCount=dao.selectCount(map);
		
		ServletContext application=getServletContext();
		int pageSize=Integer.parseInt(application.getInitParameter("POST_PER_PAGE"));
	    int blockSize=Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
	    
	    //현재 페이지 확인
	    int pageNum=1;
	    String pageTemp=request.getParameter("pageNum");
	    if(pageTemp!=null && !pageTemp.equals("")){
	    	pageNum=Integer.parseInt(pageTemp);//요청받은 페이지로 수정
	    }
	    
	    //게시글 보여주는 범위 설정
	    int start=(pageNum - 1)*pageSize+1;
	    int end=pageNum*pageSize;
	    map.put("start",start);
	    map.put("end",end);
	    
	    //View에 전달할 글목록
	    List<MVCBoardDTO> boardLists=dao.selectListPage(map);
		dao.close();
		
		//View에 전달할 매개변수 (페이징 관련,HTML코드에 넣음)
		String pagingImg=BoardPage.pagingStr(totalCount, pageSize, blockSize, pageNum, "../mvcboard/list.do");
		map.put("pagingImg", pagingImg);
		map.put("totalCount",totalCount);
		map.put("pageSize", pageSize);
		map.put("pageNum",pageNum);
		
		//View로 속성 전달 및 forward
		request.setAttribute("boardLists", boardLists);
		request.setAttribute("map", map);
		request.getRequestDispatcher("/14MVCBoard/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
