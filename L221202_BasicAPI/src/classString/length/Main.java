package classString.length;

public class Main {
	public static void main(String[] args) {
		String ssn="123456-1234567";
		
		int length=ssn.length();
		System.out.println("length : "+length);
		
		if(length==14) {
			System.out.println("주민등록번호가 맞습니다.");
		}else {
			System.out.println("주민등록번호가 아닙니다.");
		}
	}
}
//사용자의 모든 오입력에 대비해야한다