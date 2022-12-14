package dataAccessObject;

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
	
	public ArrayList<MemberVo> list(){
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		
		try {
			connDB();
			String query="SELECT * FROM emp";
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				String empno=rs.getString("empno");
				String ename=rs.getString("ename");
				int sal = rs.getInt("sal");
				
				MemberVo data = new MemberVo(empno,ename,sal);
				list.add(data);
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
			stmt=conn.createStatement();
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
		//MemberDAO : 오라클과 자바를 연결하고 , 값을 받아옴 
		//list() 메서드로 MemberVo ArrayList로 값을 전달함
		MemberDAO dao = new MemberDAO();
		//MemberVo : RS값을 한꺼번에 저장하기 위한 객체
		//필드에 대응하는 멤버변수와 get메서드를 만들어둠
		
		ArrayList<MemberVo> list = dao.list();
		
		for(int i=0;i<list.size();i++) {
			MemberVo data= (MemberVo)list.get(i);//rawtype이었으면 명시적 타입캐스팅 해야함
			String empno=data.getEmpno();
			String ename=data.getEname();
			int sal=data.getSal();
			
			System.out.println(empno+" : "+ename+" : "+ sal);
		}
		//ArrayList에 담긴 값을 출력
	}
}
//3개의 클래스 생성 - DAO클래스 VO클래스 메인메서드포함한클래스(프로그램의 시작)

//이전에 배운 코드로 작업하는것을 '절차지향적'이라고 함
//객체지향적으로 방식을 바꿔야 함
//DAO로 DB에 접근하고 VO에 그 값을 받아 출력함

//DAO : 
//DB 접근을 전담하는 객체

//VO(TO,DTO) :
//Value Object / Transfer Object / Data Transfer Object
//다른 타입의 여러 데이터를 다른클래스로 전달할 때 사용