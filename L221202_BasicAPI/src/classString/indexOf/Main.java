package classString.indexOf;

public class Main {
	public static void main(String[] args) {
		String subject="자바 프로그래밍";
		
		int location=subject.indexOf("프로그래밍");
		System.out.println("location : "+location);
		
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련이 있습니다.");
		}else {
			System.out.println("자바와 관련이 없습니다.");
		}
	}
}
//'자','바',공백,'프','로','그','래','밍'중 아무거나 한글자 넣어도 찾아줌
//" 프",그래" 등 이어진 문자들을 입력해도 찾아준다.
//없는 문자를 입력하면 location은 -1이다
//따라서 if문의 조건식이 subject.indexOf(문자열)!=-1인 것