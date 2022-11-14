package package1;

public class RandomNumber {
	public static void main(String[] args) {
//		1~99까지의 정수를 출력하는 프로그램을 작성하세요.
		int n=(int)(Math.random()*99)+1;
		System.out.println(n);
//		0.0~0.99까지의 실수를 출력하는 프로그램을 작성하세요.(소수점 2자리)
		System.out.println(((int)(Math.random()*100))/(double)100);

//			0.0<= Math.random() <1.0
//			*이 범위를 100으로 나누면 0부터 0.99999....가 출력된다.
//			따라서 자릿수를 통제하려면 버림기능을 이용해야 한다
//			int끼리 연산하면 버림기능이 있으므로 0~99범위의 정수 난수를 만든 뒤, 100으로 나누어서 범위를 만들기로 하였다.
//			0.0<= Math.random()*100 <100.0
//			0<= (int)(Math.random()) <100
//			0 ~ 99 범위의 정수를 다시 100.0으로 나눈다
//			*이때 100으로 나누면 int끼리 연산하여 소수점아래는 버리므로 피연산자 중 어느 한쪽을 실수로 타입캐스팅해주어야 한다.
//			따라서 ((int)(Math.random()*100)/100.0
	
		
//		강사님답안
		double d=Math.random();
		System.out.printf("%.2f",d);
		
	}
}
