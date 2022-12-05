package classString.Constructor;

public class Main {
	public static void main(String[] args) {
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		
		String str1=new String(bytes);
		//byte 배열을 String 생성자로 넣으니 유니코드에 따라 문자열을 출력하였다.
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		//bytes[5]부터 4개 출력
		System.out.println(str2);
		
		System.out.printf("%c",65);
		System.out.printf("%c",97);
	}
}
