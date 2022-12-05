package p402;

class Parent{
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface I1{
	default void method1() {
		System.out.println("method1() in I1");
	}
	default void method2() {
		System.out.println("method2() in I1");
	}
	static void staticMethod() {
		System.out.println("staticmethod() in I1");
	}
}

interface I2{
	default void method1() {
		System.out.println("method1() in I2");
	}
	static void staticMethod() {
		System.out.println("staticmethod() in I2");
	}
}



class Child extends Parent implements I1,I2{
	//	Duplicate default methods named method1 with the parameters () and () are inherited from the types I2 and I1
	// 인터페이스 다중 상속시 default 메서드가 겹치면 반드시 오버라이딩해야한다.
	public void method1() {
		System.out.println("method1() in Child");
	}
	// 인터페이스의 default메서드와 조상클래스의 메서드가 겹치면 ...
}

public class DefaultMethodTest {
	public static void main(String[] args) {
		Child c=new Child();
		c.method1();
		c.method2();//조상클래스의 메서드가 우선한다.
		I1.staticMethod();
		I2.staticMethod();
	}
}
