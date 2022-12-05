package p405;//정석p405, 교재 java3 70

public class InnerEx1 {
	class InstanceInner{
		int iv=100;
		static int cv=100;//교재에서는 에러, 여기서는 X
		final static int CONST=100;//final static은 상수이므로 허용
	}
	static class StaticInner{
		int iv=200;
		static int cv=200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
			static int cv=300;//교재에서는 에러, 여기서는 X
			final static int CONST=300;//final static은 상수이므로 허용
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		//test
		InstanceInner.cv=2;//컴파일러가 해당변수에 자동으로 final을 추가한건지 확인
		System.out.println("InstanceInner.cv = "+InstanceInner.cv);//final이 아닌것을 확인하였다.
	}
//	openjdk16 releasenote에서 금지를 해제했다는 문구를 발견했는데
//	강사님 말씀으로는 사용중인 java와 다른버전이라고 한다!
}
