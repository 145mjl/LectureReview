package adapterClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WithAdapter extends WindowAdapter{
	private Frame f;
	private Button[] btn;
	
	public WithAdapter() {
		f=new Frame("Frame Title");
		btn=new Button[5];
		for(int i=0;i<5;i++) {
			btn[i]=new Button("Button "+(i+1));
		}

	}
	
	public void startFrame() {
		f.addWindowListener(this);
		//실수 : 리스너안씀
		f.setLayout(new FlowLayout());
		for(int i=0;i<btn.length;i++) {
			f.add(btn[i]);
		}
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public void windowClosing(WindowEvent e) {//실수2 : 매개변수로 이벤트객체를 넣지 않음
		System.exit(0);
	}
	
	public static void main(String[] args) {
		WithAdapter a=new WithAdapter();
		a.startFrame();
	}
}
//다른 리스너클래스를 쓸 때 실수가 잦음
//아직 Listener클래스에 대한 이해가 부족한것으로 생각됨