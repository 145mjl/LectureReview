package case4AnonymousEventHandlerClass;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	private Frame f;
	private Button btn1,btn2,btn3,btn4,btn5;
	
	public Main() {
		f=new Frame("창제목");
		btn1=new Button("Label 1");
		btn2=new Button("Label 2");
		btn3=new Button("Label 3");
		btn4=new Button("Label 4");
		btn5=new Button("Label 5");
	}
	
	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 1 Click!");
			}
		});
		//1,2,3번 케이스는 버튼 객체 5개를 가지고 있는 메인클래스에서 자기자신의/다른클래스의/내부클래스의 actionPerformed메서드를 호출
		//→ 메서드가 5개의 listener의 액션에 대해 어떤 performance를 할 것인지 모르므로
		//→ if문으로 하나씩 지정해주어야 함
		//3번 케이스는 버튼객체마다 내부클래스로 구현해 주었으므로 그럴 필요가 없다
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 2 Click!");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 3 Click!");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 4 Click!");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 5 Click!");
			}
		});
		
		f.add(btn1,BorderLayout.NORTH);
		f.add(btn2,BorderLayout.SOUTH);
		f.add(btn3,BorderLayout.WEST);
		f.add(btn4,BorderLayout.EAST);
		f.add(btn5,BorderLayout.CENTER);
		
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		Main m=new Main();
		m.startFrame();
	}
}
