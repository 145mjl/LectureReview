package adapterClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WithOutAdapter implements WindowListener{
	private Frame f;
	private Button btn1,btn2,btn3;
	
	public WithOutAdapter() {
		f=new Frame("Frame Title");
		btn1=new Button("Button 1");
		btn2=new Button("Button 2");
		btn3=new Button("Button 3");
	}
	
	public void startFrame() {
		f.setLayout(new FlowLayout());//레이아웃 객체를 넣어야함
		f.addWindowListener(this);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		f.setSize(300,300);
		f.setVisible(true);
	}
//만약 버튼위치 하나하나를 설정하고 싶다면
//setLayout param을 null값으로 하고 객체별로 setLocation setSize하거나 기존 레이아웃매니저를 잘 이용하기	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		WithOutAdapter m=new WithOutAdapter();
		m.startFrame();
		
	}
}
//인터페이스를 구현하려면 상속받은 모든 추상메서드를 구현해야함
//이것을 보완하기 위해 Adapter클래스가 {} 로 구현해둠
//Adapter클래스에서 상속받아 원하는 메서드만 사용하면 됨