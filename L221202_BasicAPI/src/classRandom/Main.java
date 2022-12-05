package classRandom;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] selectNumber=new int[6];
		Random random=new Random(3);
		//seed값을 초기값으로 하는 난수가 발생한다. 또한 몇번이고 실행해도 숫자들의 조합이 같다.
		//기본생성자를 호출시 - 항상 다른값을 내기 위해 현재시간을 시드로 사용한다.
		System.out.println("선택 번호 : ");
		
		for(int i=0;i<6;i++) {
			selectNumber[i]=random.nextInt(45)+1;
			//Random 클래스의 nextInt()메서드
			//parameter를 입력하면 0<= <parameter범위 내의 임의의 정수값을 반환한다.
			//따라서 +1하여 1부터45의 랜덤한 숫자를 생성한다.
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		int[] winningNumber=new int[6];
		random=new Random(5);
		System.out.println("당첨 번호 : ");
		for(int i=0;i<6;i++) {
			winningNumber[i]=random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);//객체 내용 비교를 위해 정렬
		Arrays.sort(winningNumber);
		boolean result=Arrays.equals(selectNumber,winningNumber);//배열요소값이 같은지 체크
		if(result) {
			System.out.println("축하합니다! 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
