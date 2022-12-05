package p409;

class Outer{
	int value=10;
	
	class Inner{
		int value=20;
		
		void method1() {
			int value=30;
			System.out.println("value:"+value);
			System.out.println("this.value="+this.value);
			System.out.println("Outer.this.value="+Outer.this.value);
		}
	}
}

public class InnerEx5 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.Inner ic = oc.new Inner();
		ic.method1();
	}
}
