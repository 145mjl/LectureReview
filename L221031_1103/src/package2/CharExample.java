package package2;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
//		변수 선언부와 나머지 로직을 분리하여 가독성을 높임
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c2+1);
		System.out.println((char)(c2+1));
	}
}
