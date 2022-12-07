package case3InnerIsEventHandlerClass;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	
	private Frame f;
	private Button btn1,btn2,btn3,btn4,btn5;
	
	public Main() {
		f=new Frame("어쩌고");
		btn1=new Button("라벨1(액션커맨드1)");
		btn2=new Button("라벨2(액션커맨드2)");
		btn3=new Button("라벨3(액션커맨드3)");
		btn4=new Button("라벨4(액션커맨드4)");
		btn5=new Button("라벨5(액션커맨드5)");
	}
	
	public void startFrame() {
		f.add(btn1,BorderLayout.NORTH);
		f.add(btn2,BorderLayout.EAST);
		f.add(btn3,BorderLayout.WEST);
		f.add(btn4,BorderLayout.SOUTH);
		f.add(btn5,BorderLayout.CENTER);
		
		btn1.addActionListener(new InnerHandler());
		btn2.addActionListener(new InnerHandler());
		btn3.addActionListener(new InnerHandler());
		btn4.addActionListener(new InnerHandler());
		btn5.addActionListener(new InnerHandler());
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	
	class InnerHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals("라벨1(액션커맨드1)")) {
				System.out.println("Button 1 Click!");
			}
			if(e.getActionCommand().equals("라벨2(액션커맨드2)")) {
				System.out.println("Button 2 Click!");
			}
			if(e.getActionCommand().equals("라벨3(액션커맨드3)")) {
				System.out.println("Button 3 Click!");
			}
			if(e.getActionCommand().equals("라벨4(액션커맨드4)")) {
				System.out.println("Button 4 Click!");
			}
			if(e.getActionCommand().equals("라벨5(액션커맨드5)")) {
				System.out.println("Button 5 Click!");
			}
		}
	}

	
	
	public static void main(String[] args) {
		Main m = new Main();
		m.startFrame();
	}
}
//Program이 실행되면, Program과 관련된 메모리를 운영체제가 할당한다.
//실행되어서 메모리에 올라온 상태를 Process라고 한다