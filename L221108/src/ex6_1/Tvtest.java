package ex6_1;

public class Tvtest {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel=7;
		t.power();
		t.channelUp();
		t.channelDown();
		System.out.println(t.channel);
		
	}
}
//멤버변수는 t뿐임
//t는 tv 인스턴스를 '참조'하기 위한 변수

//note:Tv와 Tvtest를 다른 패키지에 넣고 작성하면 Tv의 멤버변수가 default이기 때문에 다른 패키지에서는 직접 접근할 수 없다.