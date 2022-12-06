package borderLayout;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;
//버튼을 제거하면 center버튼이 빈자리를 채워주는 것을 확인할 수 있다
public class BorderTest2 {
	private Frame frame;
	private Button west,center;
	private TextField tf1;
	
	public BorderTest2() {
		frame=new Frame("BorderLayout example2");
		west=new Button("button 1");
		center=new Button("button 4");
		tf1=new TextField();
		tf1.setText("입력창입니다.");
	}
	
	public void startFrame() {
		frame.add(tf1,"North");
		frame.add(west,"West");
		frame.add(center,BorderLayout.CENTER);
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderTest2 b=new BorderTest2();
		b.startFrame();
		
	}
}
