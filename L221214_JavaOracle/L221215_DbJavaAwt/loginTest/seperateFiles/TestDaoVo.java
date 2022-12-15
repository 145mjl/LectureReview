package loginTest.seperateFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class MemberDAO{
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521/xe";
	String user="c##green";
	String password="green1234";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public ArrayList<MemberVo> list(String id){
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		
		try {
			connDB();
			String query="SELECT * FROM test";
			if(id!=null) {
				query += " where testid='" + id/* .toLowerCase() */+"'";
			}
			//대소문자구분하도록 수정
			System.out.println("SQL : "+query);
			
			rs=stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : "+rs.getRow());
			
			if(rs.getRow()==0) {
				System.out.println("0 row selected...");
			}else {
				System.out.println(rs.getRow()+" rows selected...");
				
				rs.beforeFirst();
				
				while(rs.next()) {
					String testid=rs.getString("testid");
					String testpw=rs.getString("testpw");
					
					MemberVo data = new MemberVo(testid,testpw);
					list.add(data);
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc Driver loading success.");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

class MemberVo{
	private String testid;
	private String testpw;
	
	public MemberVo() {	}
	
	public MemberVo(String testid,String testpw) {
		this.testid=testid;
		this.testpw=testpw;
	}
	
	public String getTestid() {
		return testid;
	}
	
	public String getTestpw() {
		return testpw;
	}
}

