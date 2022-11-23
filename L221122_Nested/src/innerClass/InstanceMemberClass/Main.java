package innerClass.InstanceMemberClass;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		A.B.field2=2;
		A.B.method2();
		System.out.println("b.field1 : "+b.field1);
		System.out.println("b.field2 : "+A.B.field2);
	}
}
