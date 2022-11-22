package inheritance.polymorphism.ChildEx;

public class ChildEx2 {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.method1();
		parent.method2();
//		parent.method3();//호출불가
		
		System.out.println();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		parent = child;
		parent.method1();
		parent.method2();
	}
}
