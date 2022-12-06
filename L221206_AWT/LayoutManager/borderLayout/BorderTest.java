package borderLayout;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;

public class BorderTest {
	private Frame frame;
	private Button center,west,east,south;
	private TextField tf1;
	
	public BorderTest() {
		frame=new Frame("BorderLayout example");
		south=new Button("button 1");
		west=new Button("button 2");
		east=new Button("button 3");
		center=new Button("button 4");
		tf1=new TextField();//대소문자구별함에 주의
		tf1.setText("입력창입니다.");
	}
	
	public void startFrame() {
		//BorderLayout은 화면을 5개의 영역(동서남북중)으로 구분
		frame.add(tf1,"North");
		frame.add(south,BorderLayout.SOUTH);
		frame.add(west,"West");
		frame.add(east,BorderLayout.EAST);
		frame.add(center,BorderLayout.CENTER);
		//문자열로 각 Component의 위치를 지정할수도 있지만, 기본 제공되는 상수를 사용해도 된다
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderTest b=new BorderTest();
		b.startFrame();
		
	}
}
//메서드 호출 순서
//1.메인메서드
//2.BorderTest생성자
//3.BorderTest클래스의 startFrame()메서드

//Frame객체를 생성하면 기본 관리자는 BorderLayout으로 설정되어 있다 
//창 크기를 늘려보면 Component들의 크기는 변경되나 위치는 변하지 않는다.