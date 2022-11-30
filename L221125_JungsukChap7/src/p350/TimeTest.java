package p350;

class Time{
	private int hour,minute,second;
	
	Time(int hour,int minute,int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setHour(int hour) {
		if(hour<0||hour>23) {
			return;
		}//유효하지 않은 값을 입력하면 메서드를 종료한다. 이 경우 int타입변수의 초기값인 0이 유지된다.
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if(minute<0||minute>59) {
			return;
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		if(second<0||second>59) {
			return;
		}
		this.second = second;
	}
	
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	
}
public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time(12,35,30);
		System.out.println(t1.toString());
//		t1.hour=13;
//		The field Time.hour is not visible
		t1.setHour(t1.getHour()+1);
		System.out.println(t1);//System.out.println(t1.toString());
	}
}
