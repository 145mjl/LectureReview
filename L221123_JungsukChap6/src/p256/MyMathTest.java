package p256;

class MyMath {
	public long add(long a, long b) {
		return a + b;
	}
	/*
	 * long타입을 입력받고 더 좁은 범위의 int타입으로 반환함 → 컴파일 에러
	 * public int add(long a, long b) { return a + b; }
	 */

	public long substract(long a, long b) {
		return a - b;
	}

	public long multiply(long a, long b) {
		return a * b;
	}

	public double divide(double a,double b) {
		return a / b;
	}
}

public class MyMathTest {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		
		System.out.println("add(5L, 3L) = "+m.add(5L, 3L));
		System.out.println("add(5, 3) = "+m.add(5, 3));//long타입이 int보다 범위가 크기 때문에 OK
		System.out.println("substract(5L, 3L) = "+m.substract(5L, 3L));
		System.out.println("multiply(5L, 3L) = "+m.multiply(5L, 3L));
		System.out.println("divide(5L, 3L) = "+m.divide(5L, 3L));
	}
}
