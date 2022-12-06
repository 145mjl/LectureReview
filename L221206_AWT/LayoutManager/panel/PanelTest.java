package panel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelTest {
	private Frame f;
	private Panel p;
	private Button ok,cancel;
	private TextField tf1;
	
	public PanelTest() {
		f=new Frame("panel example");
		ok=new Button("전송");
		cancel=new Button("삭제");
		tf1=new TextField("input...");
		p=new Panel();
	}
	
	public void startFrame() {
		f.add(tf1,BorderLayout.NORTH);
		p.setBackground(Color.green);
		p.add(ok);
		p.add(cancel);
		f.add(p,BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		PanelTest pt = new PanelTest();
		pt.startFrame();
	}
}
//패널을 쓰는 이유 - 레이아웃 매니저를 복합적으로 쓸 수 있다.
//위 코드에서 Frame은 BorderLayout을 설정하였음 (tf1과 p)
//Panel 내부의 레이아웃매니저는 FlowLayout(기본값)