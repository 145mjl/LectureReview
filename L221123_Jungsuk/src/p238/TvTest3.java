package p238;

public class TvTest3{
	private String color;
	private int channel;
	private boolean power;
	
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setChannel(int channel) {
		this.channel=channel;
	}
	public void setPower(boolean power) {
		this.power=power;
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

class Main {
	public static void main(String[] args) {
		TvTest3 t1 = new TvTest3();
		TvTest3 t2 = new TvTest3();
		
		System.out.println("t1의 channel값은 "+t1.getChannel()+"입니다.");
		System.out.println("t2의 channel값은 "+t2.getChannel()+"입니다.");
		
		t2=t1;
		t1.setChannel(7);
		System.out.println("t1의 channel값을 "+t1.getChannel()+"로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+t1.getChannel()+"입니다.");
		System.out.println("t2의 channel값은 "+t2.getChannel()+"입니다.");
	}
}
