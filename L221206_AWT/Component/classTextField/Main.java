package classTextField;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Main {
	public static void main(String[] args) {
		Frame f=new Frame("Login");
		
		f.setSize(500,100);
		f.setLayout(new FlowLayout());
		f.setResizable(false);
		
		Label lid = new Label("ID : ",Label.RIGHT);
		Label lpwd=new Label("password : ",Label.RIGHT);
		
		TextField id=new TextField(10);
		TextField pwd=new TextField(10);
		pwd.setEchoChar('*');
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		
		f.setVisible(true);
		
	}
}