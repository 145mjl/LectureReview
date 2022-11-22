package oop_Interface.RemoteEx;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
//상수에 default붙이면 error인 이유
//그동안 배운 default는 지정자가 아니며, 아무것도 붙이지 않으면 default임
//default method는 오직 인터페이스에서만 사용한다.

//Java8에서 인터페이스에 default method가 추가되었다.
//https://velog.io/@heoseungyeon/%EB%94%94%ED%8F%B4%ED%8A%B8-%EB%A9%94%EC%84%9C%EB%93%9CDefault-Method