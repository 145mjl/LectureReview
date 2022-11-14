package p172;

import java.util.Scanner;

public class Ex4_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		int inp=0,sum=0;
		boolean flag=true;
		
		while(flag) {
			System.out.print(">>");
			inp=sc.nextInt();
			
//			Comment : 만약 교재처럼 String 변수 선언하고 스캐너로 입력받고 
//			Integer.parseInt를 사용하여 int타입변수에 대입하는 방식을 사용하면
//			그냥 엔터를 쳤을때 문자열은 ""가 입력되며 이것은 int로 변환불가하여 에러 발생함
			
			if(inp!=0) {
				sum+=inp;
			}else {
				flag=false;
			}
		}
//		Comment : flag변수도 많이 이용한다고 함
		sc.close();
		System.out.println("합계:"+sum);
	}
}
