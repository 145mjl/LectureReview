package classFormat.SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
//		java.text.DateFormat.format(Date date)
		
		sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");//24시간제
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");//12시간제
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
		
	}
}
//자바정석 p341에서도 쓰고있다