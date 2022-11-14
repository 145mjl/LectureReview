package package2;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두자리 정수를 하나 입력해주세요.");
		String input = scanner.nextLine();
//		String input = scanner.next(); 공백 이전까지만 문자열로 입력받음
//		.nextLine(); 공백까지 포함해서 문자열로 입력받음
//		.nextDouble(); 실수 입력받음(정수값 입력시 실수로 변환)
//		char input = scanner.next().charAt(0); 문자 입력받음(문자열의 맨 첫번째 글자를 따서 문자타입으로 변환)

		scanner.close(); //교재에는 없으나, warning 방지를 위한 code

		int num=Integer.parseInt(input);

		System.out.println("입력내용 : "+input);
		System.out.printf("num=%d\n",num); //%n보다 \n을 선호하는 이유 : C언어와 동일해서
	}
}
//실행시 console창에 빨간 네모가 떠있음 : 사용자의 입력을 기다리는 상태
//이 상태에서는 terminate하면 입력할 수 없게 되며 다시 실행시키면 입력 가능