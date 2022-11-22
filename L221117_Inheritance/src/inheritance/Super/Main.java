package inheritance.Super;

public class Main {
	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode=SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode=SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
	
	
}

//복습
//객체지향프로그래밍 특징 - 캡슐화(&정보은닉),상속,다형성
//this - 나자신
//super - 부모
//this(); 나자신의 생성자
//super(); 부모클래스의 생성자
//super.메서드이름(); 부모클래스의 메서드 호출