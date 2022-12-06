package p281;

public class MemberCall {
	int iv=10;
	static int cv=20;
	
	int iv2=cv;
//	static int cv2=iv;//Cannot make a static reference to the non-static field iv
//	이 시점에 iv는 존재하지 않음(인스턴스가 생성되지 않았으므로)
	static int cv3 = new MemberCall().iv;//참조변수를 선언하지 않고 인스턴스를 바로 대입.(일회성)//이시점에서는 인스턴스가 생성되었으므로 OK
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();//Cannot make a static reference to the non-static method instanceMethod1() from the type MemberCall
//		메서드를 호출한 시점에 인스턴스가 X
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}
