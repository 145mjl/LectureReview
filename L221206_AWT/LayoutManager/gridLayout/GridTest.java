package gridLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest {
	private Frame frame;
	private Button b1,b2,b3;
	private TextField tf1,tf2,tf3;
	
	public GridTest() {
		frame=new Frame("GridLayout Example");//창의 이름
		b1=new Button("button 1");//버튼객체 생성, parameter -이름
		b2=new Button("button 2");
		b3=new Button("button 3");
		tf1=new TextField("Input Text 1");//텍스트필드객체 생성, param-이름
		tf2=new TextField("Input Text 2");
		tf3=new TextField("Input Text 3");
	}
	
	public void startFrame() {
		frame.setLayout(new GridLayout(3,0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b2);
		frame.add(tf2);
		frame.add(b3);
		frame.add(tf3);//생성 순서대로 표에 기록
		
		frame.pack();
//		frame.setSize(200,200);
//		frame.setLocation(2600, 100);
		frame.setVisible(true);
		//크기와 위치는 일일히 지정할 수 있다.
		//pack()은 최소한의 크기를 지정해줌
		//아무것도 지정하지 않으면 아주 작게 보임
	}
	
	public static void main(String[] args) {
		GridTest flow = new GridTest();
		flow.startFrame();
	}
}
