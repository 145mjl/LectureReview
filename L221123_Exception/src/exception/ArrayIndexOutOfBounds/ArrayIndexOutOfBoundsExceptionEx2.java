package exception.ArrayIndexOutOfBounds;

public class ArrayIndexOutOfBoundsExceptionEx2 {
	public static void main(String[] args) {
		if(args.length==4) {
			//run configuration arguments에 값 4개를 입력하면
			String data1=args[0];
			String data2=args[1];
			String data3=args[2];
			String data4=args[3];
			//다음과 같이 출력한다.
			System.out.println("args[0] : "+data1);
			System.out.println("args[1] : "+data2);
			System.out.println("args[2] : "+data3);
			System.out.println("args[3] : "+data4);
		}else {//그렇게 하지 않은 경우 실행 방법을 알려준다.
			System.out.println("[실행 방법]");
			System.out.println("java ArrayOutofBoundsExceptionExample2");
			System.out.println("값1 값2 값3 값4");
		}
	}
}

//정상 종료되는 프로그램이 되었음
