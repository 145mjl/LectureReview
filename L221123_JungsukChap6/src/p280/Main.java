package p280;

public class Main {
	public static void main(String[] args) {
		
	}
}

class TestClass{
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {//정적 멤버가 인스턴스 멤버를 참조하고자 하는 경우에는 인스턴스를 생성해야 함
//		instanceMethod();//컴파일에러
		staticMethod();
	}
}

class TestClass2{
	int iv;
	static int cv;
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {//static메서드
//		System.out.println(iv);//인스턴스 변수 사용불가
		System.out.println(cv);//static변수는 사용가능
	}
}