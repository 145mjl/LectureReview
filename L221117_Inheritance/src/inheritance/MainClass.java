package inheritance;

public class MainClass {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
		
		B b = new B();
		System.out.println(b.fieldA);
		b.methodA();
		b.methodB();
		
	}
}
