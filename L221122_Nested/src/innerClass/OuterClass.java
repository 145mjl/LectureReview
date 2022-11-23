package innerClass;

public class OuterClass {
	private int outVar=10;
	private static int outStaticVar=20;
	
	class InnerClass{
		public void printInfo() {
			System.out.println("outVar = "+outVar);
			System.out.println("outStaticVar = "+outStaticVar);
		}
	}
	//외부클래스의 멤버변수(private지정자임에도)에 직접접근할 수 있다.
}
//캡슐화 특성을 부각한다.
//단 중첩클래스 3종 대부분이 실무에서는 잘 쓰이지 않는다.