package p362;

class Car{}

class FireEngine extends Car{}

public class InstanceOfTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is an FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is an Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		
		System.out.println(fe.getClass().getName());//p362.FireEngine
		//클래스의 실제이름은 패키지 포함이다
		
	}
}
