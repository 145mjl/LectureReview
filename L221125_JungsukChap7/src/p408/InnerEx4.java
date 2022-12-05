package p408;

class Outer{
	class InstanceInner{
		int iv=100;
	}
	static class StaticInner{
		int iv=200;
		static int cv=300;
	}
	void myMethod() {
		class LocalInner{
			int i400;
		}
	}
}
public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner	iI = oc.new InstanceInner();
		
		System.out.println("iI.iv : "+iI.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		Outer.StaticInner	sI = new Outer.StaticInner();
		System.out.println("sI.iv : "+sI.iv);
	}
}
//C:\Users\Administrator\git\LectureReview\L221125_JungsukChap7\bin\p408
//InnerEx4.class
//Outer$1LocalInner.class
//Outer$InstanceInner.class
//Outer$StaticInner.class
//Outer.class