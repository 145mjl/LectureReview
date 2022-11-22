package oop_Interface.PlaneEx;

public class JetPlane extends Plane implements Flyable,Soundable{
	public void sound() {
		System.out.println("제트기 소리 : 슈우웅");
	}
//	public 지정자 없는 경우 에러 메시지
//	Cannot reduce the visibility of the inherited method from Soundable
//	sound()메서드는 Soundable 인터페이스에서 상속받았으므로 원래는 public abstract ~ 이었다.
//	따라서 자식 클래스에서 범위를 더 좁힐 수 없다.
	public void fly() {
		System.out.println("제트기가 날아갑니다.");
	}
	
}
//디버그 실행시 F5눌러도 인터페이스로는 이동하지 않는다. 구현부가 없어서인 듯하다.