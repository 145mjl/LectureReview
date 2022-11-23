package exception.CatchOrder;

public class CatchOrderEx {
	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[1];
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

//Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception

//Exception클래스는 Exception중 최상위 클래스이다
//즉 어떤 예외가 발생하든 catch(Exception e)에서 체크하고 finally로 점프하므로 도달불가

//→따라서 자손클래스 예외에 대한 catch문을 따로 실행하고 싶다면 조상클래스 예외보다 순서를 위에 둬야 도달가능하다

