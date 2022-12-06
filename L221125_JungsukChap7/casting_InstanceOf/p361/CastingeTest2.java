package p361;

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

public class CastingeTest2 {
	public static void main(String[] args) {
		Car car=new Car();
		Car car2=null;
		FireEngine fe=null;
		
		car.drive();
		fe=(FireEngine)car;//컴파일은 되고 실행시 에러
		fe.drive();
		car2=fe;
		car2.drive();
//		Exception in thread "main" java.lang.ClassCastException: class p361.Car cannot be cast to class p361.FireEngine (p361.Car and p361.FireEngine are in unnamed module of loader 'app')
//		at p361.CastingeTest2.main(CastingeTest2.java:29)
	}
}
