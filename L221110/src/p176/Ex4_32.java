package p176;

import java.util.Scanner;

public class Ex4_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1)square");
		System.out.println("(2)square root");
		System.out.println("(3)log");
		
		while(true) {
			System.out.println("원하시는 메뉴(1~3)을 선택하세요. (종료:0)>");
			int inp=sc.nextInt();
			if(inp>=1 && inp<=3) {
				System.out.printf("선택하신 메뉴는 %d번입니다.",inp);
			}else if(inp==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				sc.close();
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
		}
	}
}
//교재처럼 작성하면 continue;를 꼭 써야 범위밖의 숫자를 입력해도 선택한 메뉴에 대한 안내가 나오지 않음
//continue문에 대한 이해를 위함