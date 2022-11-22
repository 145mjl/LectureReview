package inheritance.Instanceof;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Parent parent2 = new Parent();
		method1(parent1);
		method1(parent2);
		method2(parent1);
		method2(parent2);
		
	}
}
