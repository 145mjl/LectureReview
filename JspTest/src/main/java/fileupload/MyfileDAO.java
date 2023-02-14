package fileupload;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import common.DBConnPool;

public class MyfileDAO extends DBConnPool{
	
	public int insertFile(MyfileDTO dto) {
		int applyResult=0;
		
		try {
			StringBuilder sb=new StringBuilder();
			sb.append("INSERT INTO myfile ( ");
			sb.append("idx,name,title,cate,ofile,sfile) ");
			sb.append("VALUES ( ");
			sb.append("seq_board_num.nextval, ?, ?, ?, ?, ?)");
			
			String query=new String(sb);
			
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1,dto.getName());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getCate());
			pstmt.setString(4, dto.getOfile());
			pstmt.setString(5, dto.getSfile());
			
			applyResult=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return applyResult;
	}
	
	
	public List<MyfileDTO> myFileList(){
		List<MyfileDTO> fileList=new Vector<MyfileDTO>();
		
		try {
			String query="SELECT * FROM myfile ORDER BY idx DESC";
			pstmt=conn.prepareStatement(query);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MyfileDTO dto=new MyfileDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setCate(rs.getString(4));
				dto.setOfile(rs.getString(5));
				dto.setSfile(rs.getString(6));
				dto.setPostdate(rs.getString(7));
				
				fileList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return fileList;
	}
}
