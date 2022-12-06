package classString.substring;

public class Main {
	public static void main(String[] args) {
		String ssn="870913-1234567";
		
		String firstNum=ssn.substring(0,6);//index 0부터 6개의 값
		String secondNum=ssn.substring(7);//index 7부터 끝까지
		
		System.out.println(firstNum);
		System.out.println(secondNum);
	}
}
