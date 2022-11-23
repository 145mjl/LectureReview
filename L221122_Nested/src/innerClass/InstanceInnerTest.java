package innerClass;

public class InstanceInnerTest {
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass in= oc.new InnerClass();
		
		in.printInfo();
	}
}
//예시는 중첩클래스 중 인스턴스멤버클래스
//외부클래스의 인스턴스를 먼저 생성하고 내부클래스의 인스턴스를 생성해야함
