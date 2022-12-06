package flowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
	private Frame frame;
	private Button button1,button2,button3;
	
	public FlowTest() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
	}
	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		FlowTest f = new FlowTest();
		f.startFrame();
	}
}
//창의 Component를 일렬로 배치하지 못할 때(창이 작아졌을때) 다음 줄로 내리는 특성이 있다.

//이클립스에서 java awt 한글깨짐현상 해결
//기본인코딩이 UTF-8이면 깨진다고 한다
//https://gocoding.tistory.com/42
//https://flatsun.tistory.com/669

//알아보기 : 개발환경 인코딩 일괄 설정
//대체로 UTF-8로 함
//https://gangzzang.tistory.com/entry/%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4-%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD-UTF8-%EC%9D%B8%EC%BD%94%EB%94%A9-%EC%84%A4%EC%A0%95