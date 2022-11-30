package p352.try2;
//인스턴스제한 5개
class Singleton{
	private static Singleton[] s=new Singleton[5]; //getInstance메서드가 참조하기위함
	
	private static int num=0;//getInstance메서드가 참조하기위함
	
	public static Singleton getInstance() {//외부에서 인스턴스를 하나도 생성하지 않고도 getInstance()를 호출할수 있어야한다.->static
		if(num==s.length) {
			return s[s.length-1];//제한갯수이상 생성하려고 할시 맨마지막 값을 줌
		}else {
			s[num]=new Singleton();
			return s[num++];
		}
	}
}

public class SingletonTest2 {
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		Singleton s4=Singleton.getInstance();
		Singleton s5=Singleton.getInstance();
		Singleton s6=Singleton.getInstance();
		Singleton s7=Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
//		결과
//		p352.try2.Singleton@6f2b958e
//		p352.try2.Singleton@5e91993f
//		p352.try2.Singleton@1c4af82c
//		p352.try2.Singleton@379619aa
//		p352.try2.Singleton@cac736f
//		p352.try2.Singleton@cac736f
//		p352.try2.Singleton@cac736f
	}
}
