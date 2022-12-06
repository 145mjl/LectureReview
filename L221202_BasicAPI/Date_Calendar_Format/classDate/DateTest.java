package classDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1=now.toString();
		System.out.println(strNow1);
		//현재시간을 영어식으로 표기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//yyyy MM dd hh mm ss는 보기 편하라고 쓰는 문자가 아니라 약속된 형식이다
		//예를 들어서 yyyy년 MM일 MM일 MM시 MM분 MM초 라고 작성하면 2022년 12월 12일 12시 12분 12초 로 출력된다 
		String strNow2=sdf.format(now);
		System.out.println(strNow2);
	}
}
