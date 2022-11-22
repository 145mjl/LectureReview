package inheritance.Abstract;

public class Dog extends Animal {
//	아무것도 적지 않았을 경우
//		The type Dog must implement the inherited abstract method Animal.sound()
//		Dog 타입(Dog클래스)는 반드시 상속받은 추상메서드를 구현해야 한다.	
	public Dog() {
		this.kind="포유류";
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
}
