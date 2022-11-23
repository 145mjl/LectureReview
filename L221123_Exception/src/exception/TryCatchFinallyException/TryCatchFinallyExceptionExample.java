package exception.TryCatchFinallyException;

public class TryCatchFinallyExceptionExample {
	public static void main(String[] args) {
		String data1=null;
		String data2=null;
		
		try {
		data1=args[0];
		data2=args[1];
		
		System.out.println(data1);
		System.out.println(data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyExceptionExample num1 num2");
			return;
		}
	}
}
//try...catch문
//if-else문으로도 예외 처리를 할 수 있지만 보통 try-catch를 사용한다
//실행중에 예외가 발생하면 catch문으로 점프한다. 

//ArrayIndexOutOfBoundsException e에서 e는
//ArrayIndexOutOfBoundsException 클래스의 객체
//이 오류 객체를 통해 해당 예외 클래스의 메서드를 호출할 수 있다.

//디버그에서 F5를 눌러보기
//public ArrayIndexOutOfBoundsException(String s) {
//    super(s);
//}

//public IndexOutOfBoundsException(String s) {
//    super(s);
//}

//public RuntimeException(String message) {
//    super(message);
//}

//public Exception(String message) {
//    super(message);
//}


//public Throwable(String message) {
//    fillInStackTrace();
//    detailMessage = message;
//}

//public Object() {}

//이하는 생략