package sedanFactory;

import component.Tire;

public class Sedan {
	public static void main(String[] args) {
		Tire compoTire=new Tire();
		compoTire.setSize(20);
		System.out.println(compoTire.getSize());
		
		compoTire.setSize(-10);
		System.out.println(compoTire.getSize());
		//Tire클래스에서 값을 제한시켜놓았기 때문에 이전 세팅값이 나옴

	}
}
//debug하기
//Tire.java와 Sedan.java를 둘다 열기
//1.Tire의 모든 메서드마다 breakpoint
//Sedan의 메인메서드 1번째줄에 breakpoint
//2.또는 Sedan에만 breakpoint한뒤
//Tire쪽으로 들어가고 싶을때 F5(Step into)를 누르면 Tire의 메서드쪽으로 커서이동

//F5(Step into) F7(Step Return)