package oop_Interface.RemoteEx;

public class RemoteControlEx2 {
	public static void main(String[] args) {
//		RemoteControl rc=new RemoteControl();
//		Cannot instantiate the type RemoteControl
//		인터페이스이므로 추상메서드를 구현해주어야 한다.
		RemoteControl rc1=new Audio();
		rc1.turnOn();
		rc1.turnOff();
		RemoteControl rc2 = new RemoteControl() {
//		익명 구현 객체
//		세미콜론으로 끝내지 않고 코드블럭에서 추상메서드를 모두 구현해준다.
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("RemoteControl - turnOn()");
				System.out.println("rc2를 켭니다.");
			}
			
			public void turnOff() {
				System.out.println("RemoteControl - turnOff()");
				System.out.println("rc2를 끕니다.");
			}
			
			public void setVolume(int volume) {
				
			}
		
		};
		
		rc2.turnOn();
		rc2.turnOff();
	}
}

