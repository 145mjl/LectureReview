package p330;

class Parent{
	int x=10;
}

class Child extends Parent{
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
//x를 클릭해보면 Parent클래스의 멤버변수 x , Child클래스의 x, this.x, super.x에 블럭지정이 생긴다
public class SuperTest {
	public static void main(String[] args) {
		Child c=new Child();
		c.method();
	}
}
