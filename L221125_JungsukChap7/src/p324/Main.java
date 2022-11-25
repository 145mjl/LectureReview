package p324;

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power=!power;
	}
	void channelUp() {
		++channel;
	}
	int channelDown() {
		return --channel;
	}//연습삼아 리턴타입 추가해봄
}

class VCR{
	boolean power;
	int counter=0;
	void power() {power=!power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class TVCR extends Tv{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}

public class Main {
	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		System.out.println("tvcr.power = "+tvcr.power);
		tvcr.power();
		System.out.println("tvcr.power() 호출");
		System.out.println("tvcr.power = "+tvcr.power);
		System.out.println("tvcr.vcr.power = "+tvcr.vcr.power);
		
		System.out.println("tvcr.channel=12;");
		tvcr.channel=12;
		System.out.println("tvcr.channelUp() 호출");
		tvcr.channelUp();
		System.out.println("tvcr.channel = "+tvcr.channel);
		
	}
}
