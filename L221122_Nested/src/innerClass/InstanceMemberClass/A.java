package innerClass.InstanceMemberClass;

public class A {
	class B{
		B(){}
		int field1;
		static int field2;
		void method1() {
			System.out.println("class B - method1()");
		}
		static void method2(){
			System.out.println("asdf");
		}
	}
}
//내부클래스는 인스턴스에 연결되어 있으므로 정적 멤버를 선언할 수 없다
//

//Inner Classes
//As with instance methods and variables, 
//an inner class is associated with an instance of its enclosing class and has direct access to that object's methods and fields. 
//Also, because an inner class is associated with an instance, it cannot define any static members itself.