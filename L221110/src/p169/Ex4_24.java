package p169;

public class Ex4_24 {
	public static void main(String[] args) {
		int i=11;
		System.out.println("카운트 다운을 시작합니다.");
		while(i-- !=0) {
			System.out.println(i);
			for(int j=0; j<2_148_000_000L;j++) {
				;//아무것도 하지 않고 조건식증감식만 오가게 해서 시간을 지연시킴
			}//교재예시는 너무 빨리 출력되고 현재 코드는 10에서 안내려감
		}
		System.out.println("GAME OVER");
	}
}
