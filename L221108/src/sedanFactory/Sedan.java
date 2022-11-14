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
