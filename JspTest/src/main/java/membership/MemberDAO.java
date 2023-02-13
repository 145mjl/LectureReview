package membership;

import common.JdbcConnect;

public class MemberDAO extends JdbcConnect{

	public MemberDAO(String driver, String url, String id, String pwd) {
		super(driver, url, id, pwd);
		// TODO Auto-generated constructor stub
	}
	
	public MemberDTO getMemberDTO(String uid,String upass) {
		MemberDTO dto=new MemberDTO();
		String query="SELECT * FROM  member where id=? AND pass=?";
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, uid);
			pstmt.setString(2,upass);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
