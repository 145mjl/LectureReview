package classString.charAt;

public class Main {
	public static void main(String[] args) {
		String ssn ="123456-1234567";
		
		char p=ssn.charAt(7);
		
		switch(p) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}
}
//case문의 문법
//'3' '4'에서만 메세지를 출력할 것 같지만
//'1' '3'은 남자
//'2' '4'는 여자