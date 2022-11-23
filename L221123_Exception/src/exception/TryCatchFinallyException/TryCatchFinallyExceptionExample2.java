package exception.TryCatchFinallyException;

public class TryCatchFinallyExceptionExample2 {
	public static void main(String[] args) {
		
		try {
		String data1=args[0];
		String data2=args[1];
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);
		int result=value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyExceptionExample2 num1 num2");
			return;
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요");
		}
	}
}

//try문 안의 문장을 수행하다가 처음 예외를 만나면 (예외에 해당하는) catch문으로 점프
//따라서 try문에서 처음 예외를 발생시킨 문장 아래로는 수행되지 않음
//finally문은 마지막에 무조건 수행(Array~예외 발생, Num~예외 발생, 예외 발생 없는 경우)


//Class Exception
//	java.lang.Object
//		java.lang.Throwable
//			java.lang.Exception 


//Class RuntimeException
//java.lang.Object
//    java.lang.Throwable
//        java.lang.Exception
//            java.lang.RuntimeException 
//자식클래스 : IndexOutOfBoundsException,NullPointerException,