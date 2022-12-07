package classButton;

import java.awt.Frame;
import java.awt.Button;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300,300);
		f.setLayout(null);
		
		Button b= new Button("확인");
		b.setSize(100,50);
		b.setLocation(100, 75);
		
		f.add(b);//이 코드를 윗줄로 옮겨봤는데 예상과 달리 위치는 그대로였다 (버튼객체 선언 이후에만 작성하면 된다)
		
		f.setVisible(true);
	}
}
