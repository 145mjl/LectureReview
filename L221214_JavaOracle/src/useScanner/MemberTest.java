package useScanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class MemberDAO{
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521/xe";
	String user="c##green";
	String password="green1234";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public ArrayList<MemberVo> list(String name){
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		
		try {
			connDB();
			String query="SELECT * FROM emp";
			if(name!=null) {
				query+=" where ename='"+name.toUpperCase()+"'";
			}
			//쿼리문을 합쳤을 때 다음의 형식이어야 함 - 틀리면 syntax error
			//SELECT * FROM emp WHERE ename='이름'
			System.out.println("SQL : "+query);
			
			rs=stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : "+rs.getRow());
			
			if(rs.getRow()==0) {
				System.out.println("0 row selected...");
			}else {
				System.out.println(rs.getRow()+" rows selected...");
				
//				rs.previous();
//				예제에서는 동명이인이 없었으므로 rs.previous();로 작성한다
				
//				[동명이인 레코드를 삽입하고 테스트]

//				[오답]
//				for(int i=0;i<rs.getRow();i++) {
//					rs.previous();
//					System.out.println(rs.getRow());
//				}
//				포인터가 rs.previous()로 뒤로 가게 되면 rs.getRow()도 1 감소한다
//				rs.getRow()는 현재 커서가 위치한 행을 알려주는 것!
//				따라서 원하는 방식대로 작동하지 않는다
				
//				[제대로 작동하는 코드]
//				do {
//					rs.previous();
//				}while(rs.isFirst());
//				*while문으로 작성하면 아예 실행되지 않는다.
				
//				rs.absolute(0);//커서 인덱스를 0으로 이동
//				rs.relative(-rs.getRow());//현재 커서에서 param만큼 이동
				rs.beforeFirst();
				
				while(rs.next()) {
					String empno=rs.getString("empno");
					String ename=rs.getString("ename");
					int sal = rs.getInt("sal");
					
					MemberVo data = new MemberVo(empno,ename,sal);
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
			//stmt=conn.createStatement();
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			//TYPE_SCROLL_SENSITIVE
			//CONCUR_UPDATABLE 또는 CONCUR_READ_ONLY
			//rs.last() 등을 사용하려면 위 옵션들을 설정해야한다
			System.out.println("statement create success.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

class MemberVo{
	private String empno;
	private String ename;
	private int sal;
	
	public MemberVo() {	}
	
	public MemberVo(String empno,String ename,int sal) {
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
	}
	
	public String getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public int getSal() {
		return sal;
	}
}

public class MemberTest {
	public static void main(String[] args) {
		System.out.print("Input ename...?");
		Scanner sc = new Scanner(System.in);
		String inp=sc.next();
		
		System.out.println(inp);
		sc.close();
		
		MemberDAO dao = new MemberDAO();
		
		ArrayList<MemberVo> list = dao.list(inp);
		
		for(int i=0;i<list.size();i++) {
			MemberVo data= (MemberVo)list.get(i);
			String empno=data.getEmpno();
			String ename=data.getEname();
			int sal=data.getSal();
			
			System.out.println(empno+" : "+ename+" : "+ sal);
		}
	}
}

//syntax : 구문(프로그래밍 언어)
//구문 또는 신택스(syntax)란 프로그래밍 언어에서 
//프로그램의 모습, 형태, 구조가 어떻게 보이는지에 대해 정의하는 것이며, 
//구문은 정해진 문법을 이용한다. 