package innerClass.LocalClass;

public class E {
	void method() {
		class F {
			F(){}
			int field1;
//			static int field2; → 본래 내부클래스 안에 정적멤버를 선언시 빨간줄이었으나 현재는 안뜸
			void method1() {
				System.out.println("class E - method() - class F - method1()");
			}
//			static void method2() {}
		}
		
		F f = new F();
		f.field1=7;
		System.out.println("f.field1 : "+f.field1);
		f.method1();
		
	}
	
	
	
}
