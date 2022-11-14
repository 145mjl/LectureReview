package p105;

public class OperatorEx16 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;
		System.out.println(shortPi);
		System.out.println(Math.PI);
//		review : 파란색 대문자 - 상수라는 뜻
		System.out.printf("%.3f",pi);
//		shortPi는 int 나누기연산의 버림을 이용했고
//		%.3f는 반올림이라 다른 숫자를 출력하게 됨
	}
}
