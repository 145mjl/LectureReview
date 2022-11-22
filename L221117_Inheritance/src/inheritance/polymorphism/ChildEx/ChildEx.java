package inheritance.polymorphism.ChildEx;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
//		parent.method3(); //호출 불가
		
		System.out.println();
		child.method1();
		child.method2();//메서드 오버라이딩
		child.method3();
		
	}
	
	
	
}
