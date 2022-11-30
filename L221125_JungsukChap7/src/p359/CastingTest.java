package p359;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive Brrrr");
	}
	
	void stop() {
		System.out.println("Stop!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car = fe;
			//***참조형변수의 개념 : 인스턴스 주소값을 저장***
			//기본형변수의 대입과 형변환을 생각하니까 혼란에 빠짐
			//즉 Car car는 fe가 참조하고 있는 FireEngine인스턴스를 참조하게 된다
//		car.water();
			//컴파일 에러 - 조상타입의 멤버만 사용할 수 있다

		fe2=(FireEngine)car;
		fe2.water();
	}
}
