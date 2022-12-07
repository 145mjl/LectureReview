package classChoice;

import java.awt.Frame;
import java.awt.Choice;
import java.awt.Dimension;

public class Main {
	
	public static void main(String[] args) {
		Frame f=new Frame("Choice - Select");
		f.setSize(300,200);
		f.setLayout(null);
		
		Choice day=new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(100,50);
//		day.setLocation(100,70);//Dimension클래스 이용해서 해보기
		Dimension fSize=f.getSize();
		Dimension dSize=day.getSize();
		day.setLocation((fSize.width-dSize.width)/2, (fSize.height-dSize.height)/2);
		
		f.add(day);
		f.setVisible(true);
	}
}
