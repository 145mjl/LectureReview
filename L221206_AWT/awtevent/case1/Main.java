package case1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
	//The type Main must implement the inherited abstract method ActionListener.actionPerformed(ActionEvent)
	private Frame f;
	private Button btn1,btn2,btn3,btn4,btn5;
	
	public Main() {
		f=new Frame("event handler example");
		btn1=new Button("Button1");
		btn2=new Button("Button2");
		btn3=new Button("Button3");
		btn4=new Button("Button4");
		btn5=new Button("Button5");
	}
	
	public void startFrame() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		//Button클래스의 addActionListener(ActionListener I)
		//ActionListener I를 매개변수로 받는다는것은
		//이 인터페이스를 구현한 자손클래스를 매개변수로 받겠다는 뜻이다.
		//(인터페이스는 객체를 생성할 수 없다)
		
		//->여기에서는 Main클래스가 ActionListener를 구현했다
		//그래서 this생성자를 사용한 것이다. 
		//(참고로 자기자신,조상클래스는 Main m처럼 쓸수없으며 키워드this 또는 super를 써야만한다)
		
		//정석교재로 배웠듯이 ActionListener 인터페이스를 이용하면,
		//임의의 클래스에 간단히 actionPerformed()를 사용가능한 상태를 부여할 수 있다
		//이 인터페이스를 구현한 클래스는 반드시 actionPerformed(ActionEvent e){}를 구현할 것이기 때문이다
		
		f.add(btn1,BorderLayout.NORTH);//add(컴포넌트참조변수명,위치)
		f.add(btn2,BorderLayout.SOUTH);
		f.add(btn3,BorderLayout.WEST);
		f.add(btn4,BorderLayout.EAST);
		f.add(btn5,BorderLayout.CENTER);
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		//인터페이스 정의상 actionPerformed는 
		//ActionEvent e 를 parameter로 받도록 정의되어있다
		//복습 : 인터페이스는 자신의 메서드의 선언부만 작성하고 구현부는 작성하지 않는다(예외있음)
		if(e.getActionCommand().equals("Button1")) {
			System.out.println("Button 1 Click!");
		}
		if(e.getActionCommand().equals("Button2")) {
			System.out.println("Button 2 Click!");
		}
		if(e.getActionCommand().equals("Button3")) {
			System.out.println("Button 3 Click!");
		}
		if(e.getActionCommand().equals("Button4")) {
			System.out.println("Button 4 Click!");
		}
		if(e.getActionCommand().equals("Button5")) {
			System.out.println("Button 5 Click!");
		}
		
		//Button클래스는 멤버변수 액션커맨드가 null이면 label을 액션커맨드로 쓴다.
		//public String getActionCommand() {
		//return (actionCommand == null? label : actionCommand);
		//}
		
		//이 값이 ActionEvent 객체로 전달되는 듯하다
	}
	
	public static void main(String[] args) {

		Main m = new Main();
		m.startFrame();
	}
}
//getActionCommand() 디버그하는법
//main메서드첫번째줄 외에도 해당메서드에 breakpoint를 찍는다
//F6을 눌러 입력대기상태로 진입
