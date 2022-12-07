package classFrame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300,200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
//		f.setLocation(screenSize.width/2-150,screenSize.height/2-100);
//		하드코딩 : 코드에다 절대값을 박아넣는것. 비추천
//		아래와 같이 창의 크기도 얻어와서 Location parameter에 포함시켜 작성하는것을 권장함
		Dimension fSize=f.getSize();
		f.setLocation((screenSize.width-fSize.width)/2 , (screenSize.height-fSize.height)/2);
		f.setVisible(true);
	}
}
//툴킷이 궁금하면 네이버나 api문서등을 읽어보자