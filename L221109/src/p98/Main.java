package p98;

public class Main {
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);
		System.out.println(a+b);
		System.out.println(c);
//		note: byte타입 변수 a와 b가 +연산자로 연산되었기 때문에 int가 된다
//		그래서 byte타입 c에 넣으려고 하면 컴파일에러가 발생한다.
		
	}
}
