package classWrapper;

public class BoxingUnboxing {
	public static void main(String[] args) {
//		Integer obj1=new Integer(100);
//		Integer obj2=new Integer("200");
//		The constructor Integer(int) has been deprecated since version 9 and marked for removal
//		구버전 문법 일부에는 warning이 뜨고, 취소선 처리되기도 한다
//		실행은 잘 됨..
		
		Integer obj1=100;
		Integer obj2=200;
//		Integer obj2="200";//컴파일 에러
		Integer obj3=Integer.valueOf("300");
		
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		int value3=obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
