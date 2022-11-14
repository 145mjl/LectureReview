package ex6_1;

public class Tv {
	String color;
	boolean power;
	int channel;
	int m=9;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		int r=3;
		System.out.println(r);
		channel--;
	}
}
//멤버변수 : color,power,channel,m
//지역변수 : r
