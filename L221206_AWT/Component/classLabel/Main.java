package classLabel;

import java.awt.Frame;
import java.awt.Label;

public class Main {
	public static void main(String[] args) {
		Frame f=new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);
		
		Label id=new Label("ID : ");
		id.setBounds(50,50,30,10);
		//size , size, location , location
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(50,65,100,10);
		
		f.add(id);
		f.add(pwd);
		f.setVisible(true);
		
		System.out.println(id.getText());
		System.out.println(id.getAlignment());
	}
}
//Label클래스 생성자는
//(String text) -> 기본값 왼쪽정렬
//(String text,int alignment)

//lecture
//awt는 운영체제 스타일에 따라가고
//swing은 그와 상관없이 자체스타일이 있다