package p260;

class MyMath {
	public long add(long a, long b) {
		return a + b;
	}
	public long substract(long a, long b) {
		return a - b;
	}

	public long multiply(long a, long b) {
		return a * b;
	}

	public double divide(double a,double b) {
		return a / b;
	}
	public int divideByZeroTest(int a,int b) {
		return a / b;
	}
}
public class DividebyZeroEx {
	public static void main(String[] args) {
		MyMath m= new MyMath();
		System.out.println(m.divideByZeroTest(5,0));
	}
}

/*
 * m.divide() 메서드 호출하여 0으로 나눌시 double근사값오류에 의해 Infinity출력
 * 
 * 테스트하기 위해 반환타입과 매개변수를 int타입으로 바꾼 메서드를 호출해보았다.
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * p260.MyMath.divideByZeroTest(DividebyZeroEx.java:19) at
 * p260.DividebyZeroEx.main(DividebyZeroEx.java:25)
 */

