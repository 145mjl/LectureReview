package p237;

class TvTest{
	
	private String color;
	private int channel;
	private boolean power;
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setChannel(int channel) {
		this.channel=channel;
	}
	
	
	public void power() {
		this.power=!this.power;
	}
	public void channelUp() {
		++this.channel;
	}
	public void channelDown() {
		--this.channel;
	}
	/* 후치형증감식으로 쓸 경우, print문에서는 증감하지 않은상태로 출력되고 연산이끝나면 증감한다 */
	
	
	public String getColor() {
		return color;
	}
	public int getChannel() {
		return channel;
	}
	public boolean getPower() {
		return power;
	}
}

public class TvTest2 {
	public static void main(String[] args) {
		TvTest t1=new TvTest();
		TvTest t2=new TvTest();
		
		System.out.println("t1의 channel값은 "+t1.getChannel()+"입니다.");
		System.out.println("t2의 channel값은 "+t2.getChannel()+"입니다.");
		
		t1.setChannel(7);
		System.out.println("t1의 channel값을 "+t1.getChannel()+"로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+t1.getChannel()+"입니다.");
		System.out.println("t2의 channel값은 "+t2.getChannel()+"입니다.");
	}
}
