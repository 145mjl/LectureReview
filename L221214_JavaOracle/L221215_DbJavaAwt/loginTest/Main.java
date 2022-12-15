package loginTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
				query+=" where testid='"+id.toLowerCase()+"'";
			}
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


class Display{
	private Frame f;
	private Panel p1,p2,p3;
	private Label l1,l2;
	private TextField t1,t2,t3;
	private Button bt;
	
	public Display() {
		f=new Frame("Login Form");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		
		l1=new Label("ID : ",Label.CENTER);
		l2=new Label("password : ",Label.CENTER);
		
		t1=new TextField(10);
		t2=new TextField(10);
		t2.setEchoChar('●');
		t3=new TextField(10);
		t3.setEditable(false);
		
		bt=new Button("Login");
	}
	
	public void startFrame() {
		f.setSize(400,200);
		f.setLayout(new FlowLayout(5));
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				
				String inp=t1.getText();
						
				ArrayList<MemberVo> list = dao.list(inp);
				
				if(list.size()==0) {
					t3.setText("login failed.");
				}
				
				for(int i=0;i<list.size();i++) {
					MemberVo data= (MemberVo)list.get(i);
					String testid=data.getTestid();
					String testpw=data.getTestpw();
					
					System.out.println(testid+" : "+testpw);
					
					if(testpw.equals(t2.getText())) {
						t3.setText("login success.");
					}else {
						t3.setText("login failed.");
					}
				}
			}
		});
		
		
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(t3);
		
		f.add(p1);
		f.add(p2);
		f.add(bt);
		f.add(p3);
		f.setVisible(true);
	}
	
	
}


public class Main {
	public static void main(String[] args) {
		Display d1 = new Display();
		d1.startFrame();
		

	}
}
//1.화면구현(java)
//2.DB구현
//(1)테이블생성
//(2)레코드삽입
//(3)자바와 연동 - DAO연동 VO클래스에 저장
//(4)awt코드와 연관

//백엔드는
//기능을 먼저 테스트 -> 화면 예쁘게

//코드 개선할 점 : 하나의 소스파일에 몰아넣기보단 분리하기