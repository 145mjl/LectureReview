package classScrollPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;


public class CanvasTest {
	public static void main(String[] args) {
		Frame f = new Frame("Canvas Test");
		f.setSize(300,200);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.pink);
		p.add(new Button("1st"));
		p.add(new Button("2nd"));
		p.add(new Button("3rd"));
		p.add(new Button("4th"));
		
		sp.add(p);
		f.add(sp);
		f.setVisible(true);
	}
}
//Scroll Pane은 컴포넌트에 스크롤 기능을 제공한다
//pane : (한 장의) 판유리
//화면보다 더 큰 컴포넌트를 표시하기 위해 사용한다

//참고) awt클래스의 자손인데 JFrame, JScrollPane같은 이름을 가지고 있다 - Swing임