package p242;

import p238.TvTest3;

/*패키지 p238의 class Tv를 다른 패키지에서 import하기 위해서는, 해당 클래스가 public이어야한다.
그런데 한 소스파일당 public 클래스는 단 하나여야 하며 그 이름은 소스파일명과 같아야한다.
그래서 메인메서드가 소속된 클래스 이름을 소스파일명→Main으로 변경하고 Tv클래스의 이름을 TvTest3으로 수정하였다*/

public class TvTest4 {
	public static void main(String[] args) {
		TvTest3[] tvAr=new TvTest3[3];
		
		for(int i=0;i<tvAr.length;i++) {
			tvAr[i]=new TvTest3();
			tvAr[i].setChannel(i+10);
		}
		
		for(int i=0;i<tvAr.length;i++) {
			tvAr[i].channelUp();
			System.out.printf("tvAr[%d].channel=%d\n",
					i, tvAr[i].getChannel());
		}
	}
}
