package package1;
public class OperatorExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2!=0)//홀수일 때
				continue;//반복문의 처음으로 돌아가기
			
			System.out.println(i);//홀수일때는 이것이 실행되지 않으므로 짝수만 출력하게 된다.
		}
	}
}
