package p178;

public class Ex4_33 {
	public static void main(String[] args) {
		Loop1: for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
//					break Loop1;//구구단에서 2x1~2x4까지만 출력
//					break;//구구단에서 2단부터 9단까지 출력하나 x1~x4까지만 출력하고 14행을 실행한뒤 다음 단으로 감
					continue Loop1;//위와 비슷해보이나 14행을 실행 안함
//					continue;//구구단에서 2단부터 9단까지 출력하나 전부 x5가 없음
				System.out.println(i+"*"+j+"="+i*j);
			}//end of for i
			System.out.println();
		}//end of Loop1
	}
}
