package p398;

interface I{
	void play();
}

class A{
	void autoPlay(I i) {
		i.play();
	}
}

class B implements I{
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I{
	public void play() {
		System.out.println("play in C class");
	}
}


public class InterfaceTest2 {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		
		//I를 구현한 클래스가 없어도 A의 autoPlay(I i)에는 컴파일오류 뜨지 않음
		//단지 a.autoPlay();를 메인메서드에서 호출하려고 하면 parameter로 null만 가능할뿐 → 실행시 nullPoint Exception 떴음
		a.autoPlay(b);
		a.autoPlay(c);
	}
}
