package p170;

import java.util.Scanner;

public class Ex4_25 {
	public static void main(String[] args) {
		int num=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. (예:12345)>");
		num=sc.nextInt();
		sc.close();
		
		for(;;) {
//			int tmp=num%10;
//			sum+=tmp;를 줄이면
			sum+=num%10;
			System.out.printf("sum=%-2d num=%-5d\n",sum,num);
			if(num<10) {
				System.out.println("각 자리수의 합:"+sum);
				break;
			}
			num/=10;
//			출력후에 나눠야함
			
		}
	}
}
//교재에서는 while문을 사용하였으며 조건식은 num!=0으로 함
//1을 10으로 나누었을때 몫은 0 나머지 1이기 때문이다