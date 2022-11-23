package exception.NullPointer;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		String data=null;
		System.out.println(data.toString());
	}
}
/*
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
 * "String.toString()" because "data" is null at
 * exception.NullPointer.NullPointerExceptionEx.main(NullPointerExceptionEx.java
 * :6)
 */

//stack의 참조변수 data에 null값 저장
//tostring()메서드는 객체를 문자열로 반환하는 메서드이며 Object클래스 소속
//어떤 인스턴스도 없기 때문에 Object클래스의 인스턴스 멤버를 사용할 수 없게 됨

//컴파일하기 전에는 어떤 에러가 있는지 모름 → 컴파일(Ctrl + F11)하면 에러메세지