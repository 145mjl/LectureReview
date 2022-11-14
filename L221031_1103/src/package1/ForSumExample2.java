package package1;
import java.util.Scanner;

public class ForSumExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp=sc.nextInt();
		long sum=0;
		//int sum=0;으로 선언하면 커다란 값을 넣었을 때 제대로 계산이 안 된다.
		
		for(int i=1;i<=inp;i++) {
			sum+=i;
		}
		System.out.println("sum : "+sum);
		sc.close();
	}
}
