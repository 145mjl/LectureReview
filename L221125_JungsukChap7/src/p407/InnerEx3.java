package p407;

public class InnerEx3 {
	private int outerIv=0;
	static int outerCv=0;
	
	class InstanceInner{
		int iiv=outerIv;
		int iiv2=outerCv;
	}
	
	static class StaticInner{
		//int siv=outerIv;
		//정적 멤버는 인스턴스 멤버를 참조할 수 없다. 정적멤버는 프로그램 실행과 동시에 클래스영역에 올라가는데 이때 인스턴스멤버는(인스턴스를 Heap에 생성해야 생김) 생성되어 있지 않기 때문이다.
		static int scv=outerCv;
	}
	
	void myMethod() {
		int lv=0;
		final int LV=0;//jdk 1.8부터 final 생략가능
		
		class LocalInner{//지역변수처럼 선언된다 - 지역클래스
			int liv = outerIv;
			int liv2=outerCv;
			int liv3=lv;//jdk 1.8부터 에러 아님
			int liv4=LV;//OK
		}
	}
	
	public static void main(String[] args) {
		
	}
}
