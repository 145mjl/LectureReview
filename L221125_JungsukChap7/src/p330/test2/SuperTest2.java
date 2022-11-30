package p330.test2;

class Parent{
	int x=10;
}

class Child extends Parent{
	int x=20;
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);//10
	}
}
//Parent클래스의 멤버변수 x & Child클래스의 super.x 
//Child클래스의 x & this.x에 블럭지정되는 것을 볼 수 있음
//Child클래스의 x는 가까운 값을 출력한다. 위 코드는 오버라이딩했으므로 this.x가 더 가까운 것

	//*만약 Parent클래스에 x와 method가 있고, Child는 x만 오버라이딩했다면, 
	//c.method();의 지역변수 x는 super.x일것이다. method가 super에 있으므로 super.x가 더 가깝기 때문이다.

public class SuperTest2 {
	public static void main(String[] args) {
		Child c=new Child();
		c.method();
	}
}
