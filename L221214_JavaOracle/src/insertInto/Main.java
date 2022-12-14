package insertInto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="c##green";
		String password="green1234";
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn=DriverManager.getConnection(url,user,password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();
			
			String sql0="SELECT deptno,dname,loc FROM dept";
			ResultSet rs0=stmt.executeQuery(sql0);
			Integer max=0;
			while(rs0.next()) {
				if(max<Integer.parseInt(rs0.getString("deptno"))) {
					max=Integer.parseInt(rs0.getString("deptno"));
				}
			}
			max+=1;
			//lecture
			//int 최대값;
			//String 문자열변수명 = "SELECT max(deptno)";
			//ResultSet 참조변수명 = Statement클래스참조변수명.executeQuery(문자열변수명);
			//while(ResultSet참조변수명.next()){
			//최대값 = ResultSet클래스의참조변수.getInt("max(기본키필드)")}를 하면 sql의 max(기본키필드)값을 가져온다.
			
			
			String ideptno=max.toString(), sdname="IT",sloc="SEOUL";
			String sql="INSERT INTO dept VALUES ('"+ideptno+"','"+sdname+"','"+sloc+"')";
			//sql문이 문법에 맞지 않는 경우
			//java.sql.SQLSyntaxErrorException: ORA-01756: 단일 인용부를 지정해 주십시오
			boolean b=stmt.execute(sql);//쿼리를 실행
			//리턴타입 boolean의 executeQuery()와 
			//리턴타입 ResultSet인스턴스의 execute() 메서드의 차이는?
			//insert into 쿼리문을 실행할때는 삽입성공여부만 알면 되고
			//select 쿼리문을 실행할때는 그 결과값도 점검해야 하기 때문이다
			if(!b) {
				System.out.println("Insert success.\n");
			}else {
				System.out.println("Insert failed.\n");
			}
			String sql2="SELECT deptno,dname,loc FROM dept";
			ResultSet rs=stmt.executeQuery(sql2);
			while(rs.next()) {
				System.out.print(rs.getString("deptno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.println(rs.getString("loc")+"\t");
			}
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
//이 소스파일은 1번 이상 실행할 경우 다음과 같은 예외를 던진다
//java.sql.SQLIntegrityConstraintViolationException: ORA-00001: 무결성 제약 조건(C##GREEN.PK_DEPT)에 위배됩니다
//왜냐하면 insert into dept values ('50','IT','SEOUL')이라는 레코드가 이미 존재하는 상황에서
//같은 기본키(deptno) '50'인 값을 넣었기 때문


//[하드코딩으로 인한 무결성제약조건 예외발생 해결하기]
//기본키인 deptno가 다른 레코드를 삽입하면 된다.

//idea1
//현재시간
//문제점 : deptno의 데이터타입은 number(2,0) - 2자리수, 소수점0자리
//yyMMddhhmmss의 12자리를 전부 표기해야 겹치지 않는 숫자를 만들어낼수 있다.
//다른 방법 필요

//idea2
//deptno의 최대값 조회 -> 최대값에 +1 -> insert into

//idea3
//애초에 deptno의 데이터타입의 크기(길이)를 잘 선언해주는 것이 좋다