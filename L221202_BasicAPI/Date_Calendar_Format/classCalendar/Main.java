package classCalendar;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year=now.get(Calendar.YEAR);
		
		int month=now.get(Calendar.MONTH)+1;//1월:0
		
		//연중 몇번째 주 : Calendar.WEEK_OF_YEAR
		
		int day=now.get(Calendar.DAY_OF_MONTH);
		//현재 년의 날짜 : Calendar.DAY_OF_YEAR
		//현재 월의 날짜 : Calendar.DATE , Calendar.DAY_OF_MONTH
		//요일 (일요일 1 ~ 토요일 7) : Calendar.DAY_OF_WEEK
		
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(day+"일");
		
		int ampm=now.get(Calendar.AM_PM);
		String strampm=null;
		if(ampm==Calendar.AM) {
			strampm="오전";
		}else {
			strampm="오후";
		}
		System.out.println(strampm+" ");
		
		int hour=now.get(Calendar.HOUR);//12시간제
		//24시간제 : Calendar.HOUR_OF_DAY
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		
		System.out.println(hour+"시 ");
		System.out.println(minute+"분 ");
		System.out.println(second+"초 ");
	}
}
