package p399;

class A{
	void methodA() {
		I i= InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I{
	void methodB();
}

class B implements I{
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() {//객체명 출력용 (overriding)
		return "class B";
	}
}

class InstanceManager{
	public static I getInstance() {//인터페이스 I를 구현한 클래스의 인스턴스를 리턴한다.
		return new B();//예제코드는 구현한 클래스가 1개라
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}
