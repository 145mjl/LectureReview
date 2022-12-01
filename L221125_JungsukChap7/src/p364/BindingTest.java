package p364;

class Parent{
	int x=100;
	
	void method() {
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	int x=100;
	
	void method() {
		System.out.println("Child method");
	}
}
public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}
}
