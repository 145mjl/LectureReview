package frame;

import java.awt.Frame;
import java.awt.event.*;

public class FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("Frame Demo");//이 Frame의 타이틀
		f.setSize(300,200);
		f.setVisible(true);
		//어떤 component를 만들었으면 반드시 마지막에 setVisible(true)
		//다르게 말하면 setVisible() 위에서 할 거 다 해야함
			//입력값을 바꿔서 중간에 창을 껐다가 켤수도 있다
		
		f.addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
//					f.dispose();//같은 기능을 함
				}
			}
		);
		//리스너 인터페이스를 구현할 시, 선언되어있는 모든 메서드를 구현해야한다
		//Adapter는 이것을 {}로 구현하여, 모든 메서드를 구현하지 않아도 되게 한다.
			//참고로 ActionListener는 메서드가 1개지만, WindowListener는 7개다
	}
}
//종료버튼 만들기
//참고 1 코드는 블로그 참조
//참고 2 각 클래스와 메서드에 대하여 https://digiconfactory.tistory.com/entry/%EC%9E%90%EB%B0%94-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-7-7-AWT-%EC%96%B4%EB%8C%91%ED%84%B0-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%9C%88%EB%8F%84%EC%9A%B0%EC%B0%BD-%EC%A2%85%EB%A3%8C%ED%95%98%EA%B8%B0