package p164;

public class Ex4_19 {
	public static void main(String[] args) {
//		int num=0;
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
//					num=i*100+j*10+k;
//					System.out.println(num);
					System.out.println(""+i+j+k);
				}
			}
		}
	}
}
//오답사유 1 : num+=i*100 식을 작성하면 누적합이라 예제 결과처럼 안나옴
//오답 2 : 가장 안쪽의 for문에 print메서드를 사용해야 모든값이 다나옴 (가장 밖에서 하면 133 233 333만 나옴)

//note : 맨처음에 문자열공백과 더해주면 문자열타입으로 자동형변환하는 것을 이용할 수도 있다