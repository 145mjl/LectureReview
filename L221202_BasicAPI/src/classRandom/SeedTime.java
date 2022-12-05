package classRandom;

import java.util.Random;

public class SeedTime {
	public static void main(String[] args) {
		Random rn = new Random();
		rn.setSeed(System.currentTimeMillis());
		//기본생성자를 일부러 명시적으로 입력하면 위와 같다
		//운영체제의 현재시간을 long타입으로 반환한다.
		for(int i=0;i<10;i++) {
			double a=rn.nextDouble();
			System.out.printf("%.3f\n",a*100);
		}
	}
}
