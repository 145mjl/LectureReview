package p315;

class Tv{
	int channel;
	boolean power;
	
	void power() {
		power=!power;
	}
	
	void channelDown() {
		--channel;
	}
	
	int channelUp() {
		return ++channel;
	}
}

class CaptionTv extends Tv{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel=10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World!");
		ctv.caption=true;
		ctv.displayCaption("Hello, World!");
		
	}
}
