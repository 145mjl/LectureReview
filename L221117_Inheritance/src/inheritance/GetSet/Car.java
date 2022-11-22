package inheritance.GetSet;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed=speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop=stop;
		this.speed=0;
	}
}

//get , set 메서드 - 무결성을 위해서
//is~() 메서드 - 관례상 대상이 ~이 맞으면 true, 아니면 false를 return한다(-->리턴타입 boolean)
