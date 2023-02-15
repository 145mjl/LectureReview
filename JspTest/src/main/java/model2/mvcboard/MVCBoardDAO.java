package model2.mvcboard;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.DBConnPool;

public class MVCBoardDAO extends DBConnPool{
	public MVCBoardDAO() {
		super();
	}
	
	public int selectCount(Map<String,Object> map) {
		int totalCount=0;
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT COUNT(*) FROM mvcboard");
		
		if(map.get("searchWord")!=null) {
			sb.append("WHERE ");
			sb.append(map.get("searchField").toString());
			sb.append(" LIKE ");
			sb.append("'%");
			sb.append(map.get("searchWord").toString());
			sb.append("%' ");
		}
		
		String query=new String(sb);
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			rs.next();
			totalCount=rs.getInt(1);
		}catch(Exception e) {
			System.out.println("게시물 조회 중 예외 발생(페이징 처리O)");
			e.printStackTrace();
		}
		return totalCount;
	}
	
	public List<MVCBoardDTO> selectListPage(Map<String,Object> map){
		List<MVCBoardDTO> list=new Vector<MVCBoardDTO>();
		
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT * FROM ");
		sb.append("( SELECT Tb.*, rowNum rNum FROM ");
		sb.append("( SELECT * FROM mvcboard ");
		if(map.get("searchWord")!=null) {
			sb.append("WHERE ");
			sb.append(map.get("searchField").toString());
			sb.append(" LIKE ");
			sb.append("'%");
			sb.append(map.get("searchWord").toString());
			sb.append("%' ");
		}
		
		sb.append("ORDER BY idx DESC");
		sb.append(" ) Tb");
		sb.append(" ) ");
		sb.append("WHERE rNum BETWEEN ? and ?");
		
		String query=new String(sb);
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, map.get("start").toString());
			pstmt.setString(2, map.get("end").toString());
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MVCBoardDTO dto=new MVCBoardDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertWrite(MVCBoardDTO dto) {
		int result=0;
		StringBuffer sb=new StringBuffer();
		sb.append("INSERT INTO mvcboard ");
		sb.append("(idx,name,title,content,ofile,sfile,pass)");
		sb.append("VALUES (");
		sb.append("seq_board_num.nextval,?,?,?,?,?,?)");
		
		String query=sb.toString();
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4,dto.getOfile());
			pstmt.setString(5, dto.getSfile());
			pstmt.setString(6, dto.getPass());
			result=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public MVCBoardDTO selectView(String idx) {
		MVCBoardDTO dto=new MVCBoardDTO();
		String query="SELECT * FROM mvcboard WHERE idx=?";
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, idx);
			rs=pstmt.executeQuery();
			if(rs.next()) {//rs 커서를 next()할 수 있다. 즉 업데이트 된 값이 있다
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void updateVisitCount(String idx) {
		StringBuffer sb=new StringBuffer();
		sb.append("UPDATE mvcboard SET");
		sb.append(" visitcount=visitcount+1");
		sb.append(" WHERE idx=?");
		String query=new String(sb);
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, idx);
			pstmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void downCountPlus(String idx) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("UPDATE mvcboard SET ");
		sb.append("downcount=downcount+1 ");
		sb.append("WHERE idx=? ");
		
		String query=sb.toString();
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, idx);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean confirmPassword(String pass,String idx) {
		boolean isCorrect=true;
		StringBuffer sb=new StringBuffer();
		sb.append("SELECT COUNT(*) FROM mvcboard ");//비밀번호값은 WHERE절에서 판단
		sb.append("WHERE pass=? and idx=? ");
		String query=sb.toString();
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, pass);
			pstmt.setString(2, idx);
			rs=pstmt.executeQuery();
			rs.next();
			if(rs.getInt(1)==0) {//조회값 없음
				isCorrect=false;
			}
			
		}catch(Exception e) {
			isCorrect=false;
			e.printStackTrace();
		}
		return isCorrect;
	}
	
	public int deletePost(String idx) {
		int result=0;
		StringBuffer sb=new StringBuffer();
		sb.append("DELETE FROM mvcboard ");
		sb.append("WHERE idx=? ");
		String query=sb.toString();
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, idx);
			result=pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int updatePost(MVCBoardDTO dto) {
		int result=0;
		StringBuffer sb=new StringBuffer();
		sb.append("UPDATE mvcboard ");
		sb.append("SET title=?,name=?,content=?,ofile=?,sfile=? ");
		sb.append("WHERE idx=? and pass=?");
		String query=sb.toString();
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getOfile());
			pstmt.setString(5, dto.getSfile());
			pstmt.setString(6, dto.getIdx());
			pstmt.setString(7, dto.getPass());
			
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
