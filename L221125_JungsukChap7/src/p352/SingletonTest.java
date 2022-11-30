package p352;

final class Singleton{//생성자가 private이므로 자손클래스 생성자 첫줄에서 super();를 할 수 없다. 즉 상속 불가이므로 final을 선언하는것이 좋다.
	private static Singleton s=new Singleton();
//	인스턴스를 n개 생성제한하고 싶다면, 위와 같은 변수를 여러개 선언하면 된다(주로 배열 사용) -> 이후 getInstance 조건문에 반영
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s==null) {//인스턴스가 하나도 생성되어있지 않다면
			s=new Singleton();//생성
		}
		return s;//생성된 인스턴스 주소를 리턴
	}
}
public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		The constructor Singleton() is not visible
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
//s2와 s3의 값(인스턴스 주소)은 같다.
	}
}
