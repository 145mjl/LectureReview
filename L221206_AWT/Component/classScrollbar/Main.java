package classScrollbar;

import java.awt.Frame;
import java.awt.Scrollbar;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,100);
		//눈금이 0에 위치하고 크기가 50 (바가 0-50범위에 있음)
		//범위는 0,100
		hor.setSize(100, 15);
		hor.setLocation(60,30);
		
		Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL,50,20,0,100);
		//눈금이 50에 위치하며, 크기가 20이다 (즉 바가 50-70범위에 보임)
		//범위는 0,100
		ver.setSize(15, 100);
		ver.setLocation(30,30);
		
		f.add(hor);
		f.add(ver);
		f.setVisible(true);
	}
}
