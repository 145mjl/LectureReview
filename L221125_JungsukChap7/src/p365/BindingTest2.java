package p365;

class Parent{
	int x=100;
	
	void method() {
		System.out.println("Parent method");
	}
}
class Child extends Parent{}

public class BindingTest2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}
}

