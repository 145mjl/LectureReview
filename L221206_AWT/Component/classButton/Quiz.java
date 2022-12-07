package classButton;

import java.awt.Frame;
import java.awt.Button;
//import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;//이것도 import해야 창을 종료할수있다


public class Quiz extends WindowAdapter implements ActionListener{
	private Frame f;
	private Button b;
	
	public Quiz() {
		//멤버변수 초기화
		//Frame f 하면 새로운 지역변수 선언이다
		f = new Frame("Login");
		b= new Button("확인");
	}
	
	public void startFrame() {
		f.addWindowListener(this);//창 종료니까 프레임 객체 대상
		b.addActionListener(this);//버튼 클릭 이벤트를 감시하므로 버튼 객체 대상!!
		
		f.setSize(300,300);
		f.setLayout(null);
		b.setSize(100,50);
		b.setLocation(100, 75);
		f.add(b);
		f.setVisible(true);
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("확인")) {
			b.setLabel("취소");
		}
		if(e.getActionCommand().equals("취소")) {
			b.setLabel("확인");
		}
		
//		if(b.getLabel().equals("확인")) {
//			b.setLabel("취소");
//		}
//		if(b.getLabel().equals("취소")) {
//			b.setLabel("확인");
//		}
		//lecture***많이 하는 실수***
		//코드가 의도대로 동작하지 않는 이유 : 
		//첫번째 if문 true->취소로 set->두번째 if문 true->확인으로 set-----> "확인"
		//따라서 if문으로 바꾸어야 한다
	}
	
	public static void main(String[] args) {
		Quiz q=new Quiz();
		q.startFrame();
	}
}
//다른 사람의 코드 : count변수를 선언하고 처음에 OK(count==0)이므로 count%2!=0이면 취소, ==0은 확인으로 정해 구현하였다.
