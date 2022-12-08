package classDialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest /* extends WindowAdapter */{
	public static void main(String[] args) {
		Frame f=new Frame("Parent");
		f.setSize(300,200);
		
		Dialog info = new Dialog(f,"Information",true);
		info.setSize(140,90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("This is modal Dialog",Label.CENTER);
		Button ok = new Button("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("OK")) {
					info.dispose();
					info.setModal(false);
				}
			}
		});
		//System.exit(0);은 프로그램을 종료하는 메서드이다
		//dispose();는 java.awt.Window클래스의 메서드로 창을 종료하는데 사용한다.
		info.add(msg);
		info.add(ok);
		
		f.setVisible(true);
		info.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
//		f.addWindowListener(new DialogTest());
		
		
	}
	
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
}
//코드에서 주석 부분은 메인메서드가 선언된 클래스를 EventHandlerClass로 했을 때이다
//실수 및 오개념 :
//main method는 클래스 구조화를 안할때 코드를 몰아넣는 집합의 장이 아니다
//여기에서 windowClosing 메서드를 오버라이딩하면 코드자체는 맞더라도 컴파일에러가 생긴다
//WindowAdapter를 상속받은 *클래스 내에서* 메서드를 Override해야한다


//modal
//해당 창은 오직 코드에서 지정된 버튼을 눌러야만 Focus에서 벗어날 수 있다
//예를 들어 대부분의 경고창들은 확인,취소 등을 눌러야 끄거나 다른창을 Focus(맨 위에 띄우거나 활성화하는것)할 수 있다