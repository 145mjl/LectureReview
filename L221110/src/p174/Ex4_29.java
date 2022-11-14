package p174;
//369게임
public class Ex4_29 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d",i);
			int tmp=i;
			
			do {
				if(tmp%10%3==0 && tmp%10!=0) {
					//조건 1 : 일의 자리 수가 0,3,6,9인가?
					//조건 2 : 나머지 연산 특성상 일의 자리 수가 0인 것도 조건1을 만족하므로 해당 숫자는 걸러낸다
					System.out.println("짝");
				}
			}while((tmp/=10)!=0);
			//연산을 한 번 더 반복하면 10의자리수가 3,6,9일때 짝을 출력 가능하며
			//tmp가 한자리수가 되면 조건식이 false가 되어 더이상 반복하지 않고 탈출한다.
			System.out.println();
		}
	}
}
