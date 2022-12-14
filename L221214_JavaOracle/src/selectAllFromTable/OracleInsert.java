package selectAllFromTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleInsert {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		//오라클 DB를 쓸경우
		String url="jdbc:oracle:thin:@192.168.0.134:1521:xe";
		//@문자열:문자열:문자열
		//(1)접속할 데이터베이스의 ip주소. 
		//자신의 컴퓨터의 ip주소를 나타내는 localhost 또는 127.0.0.1 를 입력해도 되고,
		//또는 ipconfig 명령어를 사용하여 ipv4주소를 조회하여 붙여넣어도 된다 (나는 192.168.0.134)
		//(2)포트 번호
		//1521 : 기본값
		//(3)SID
		//이것을 모르는 경우 system계정으로 sqlplus에 로그인하여 select name from v$database;를 입력하면 확인이 가능하다
		//xe는 익스프레스 에디션의 SID이다. 아마도?
				//tnsnames.ora 파일에서 확인가능
				//혹은 Dbeaver 등으로 로그인할때도 확인가능
		
		String user="c##green";
		//본인이 접속할 오라클 계정의 아이디
		String password="green1234";
		//본인이 접속할 오라클 계정의 비밀번호
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn=DriverManager.getConnection(url,user,password);
			System.out.println("oracle connection success.\n");
			
			Statement stmt=conn.createStatement();
			
			String sql="SELECT * FROM dept";
			ResultSet rs=stmt.executeQuery(sql);
			//select 쿼리문의 결과 table을 자바에서 받는 형태
			while(rs.next()) {
				System.out.print(rs.getString("deptno")+" ");
				System.out.print(rs.getString("dname")+" ");
				System.out.println(rs.getString("loc")+" ");
			}
			//StringTokenizer 클래스처럼, while문을 돌면서 다음값이 있을때까지 값을 가져온다
		}catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
			e.printStackTrace();//보다 자세한 에러메세지를 출력해준다.
		}catch(SQLException e) {
			System.out.println("oracle connection fail.");
			e.printStackTrace(); 
		}
	}
}
