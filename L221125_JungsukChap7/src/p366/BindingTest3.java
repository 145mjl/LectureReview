package p366;

class Parent{
	int x=100;
	
	void method() {
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	int x=200;
	
	void method() {
		System.out.println("x="+x);//가까운 x -> this.x
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
}

public class BindingTest3 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}
}

