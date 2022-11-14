import java.util.Calendar;

public class CalanderExample {
	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};
	//상수(constant)를 작성할 때 전부 대문자로 씀
	public static void main(String[] args) {
		Week today=null;
//		변수타입 변수명=null;
		Calendar cal = Calendar.getInstance();
//		new로 객체를 생성할 수 없으며 getInstance() 메서드로 
//		싱글턴 패턴 : 객체의 생성 개수를 일정하게 조절할 수 있다.
//		design pattern 교재 추천 : https://product.kyobobook.co.kr/detail/S000001810483
		int iWeek= cal.get(Calendar.DAY_OF_WEEK);
		switch(iWeek) {
		case 1:
			today =Week.SUNDAY;
			break;
//			today라는 변수에는 넣을수 있는 값이 한정되어 있다.
		case 2:
			today =Week.MONDAY;
			break;
		case 3:
			today =Week.TUESDAY;
			break;
		case 4:
			today =Week.WEDNESDAY;
			break;
		case 5:
			today =Week.THURSDAY;
			break;
		case 6:
			today =Week.FRIDAY;
			break;
		case 7:
			today =Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 공부하는 날 입니다.");
		}
	}

}
