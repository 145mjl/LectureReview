package exception.ArrayIndexOutOfBounds;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		String data1=args[0];
		String data2=args[1];
		
		System.out.println("args[0] : "+data1);
		System.out.println("args[1] : "+data2);
		
	}
}

/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0
 * out of bounds for length 0 at
 * exception.ArrayIndexOutOfBounds.ArrayIndexOutOfBoundsExceptionEx.main(
 * ArrayIndexOutOfBoundsExceptionEx.java:5)
 */

//위 코드만 적으면 비정상종료된 것
//따라서 example2 파일처럼 처리해줘야함

//현재파일에서 정상적으로 실행해보는 법
//Run>>Run Configurations>>Arguments>>문자열 2개 입력>>Run

