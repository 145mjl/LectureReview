package loginTest.seperateFiles;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


class Display{
	//awt의 component들을 지역변수로 하면 메서드 밖에서는 유효하지않으나,
	//멤버변수로 넣으면 해당클래스의 인스턴스가 생성된곳에서는 계속 유효하다
	private Frame f;
	private Panel p1,p2,p3;
	private Button bt;
	private Label l1,l2;
	private TextField t1,t2,t3;
	
	public Display() {
		f=new Frame("Login Form");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		bt=new Button("Login");
		l1=new Label("id",Label.CENTER);
		l2=new Label("password",Label.CENTER);
		t1=new TextField(10);
		t2=new TextField(10);
		t2.setEchoChar('●');//char '' String ""
		t3=new TextField(10);
	}
	
	public void startFrame() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension ScrSize=tk.getScreenSize();
		f.setSize(ScrSize.width/3 , ScrSize.height/3 );
		Dimension fSize=f.getSize();
		f.setLocation((ScrSize.width-fSize.width)/2,(ScrSize.height-fSize.height)/2);
		f.setResizable(true);
		f.setLayout(new FlowLayout());
		
		
		
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
		f.add(p1);
		p2.add(l2);
		p2.add(t2);
		f.add(p2);
		p3.add(t3);
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
