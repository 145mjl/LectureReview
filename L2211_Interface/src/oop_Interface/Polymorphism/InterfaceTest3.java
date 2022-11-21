package oop_Interface.Polymorphism;

public class InterfaceTest3 {
	public static void main(String[] args) {
		ExtendsTest et = new ExtendsTest();
		
		et.in1Method();
		et.in2Method();
		
		System.out.println(In1.x);
		System.out.println(In2.x);
	}
}
//et.in1Method();디버그 F5 --> ExtendsTest클래스까지만 
//In1 것인지 In2것인지 알수도 없고 추상메서드였으므로 의미도 없을 것
