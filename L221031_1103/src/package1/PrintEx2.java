package package1;

public class PrintEx2 {
	public static void main(String[] args) {
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		String url = "www.codechobo.com";
		
		System.out.printf("f1=%f, %e, %g\n",f1,f1,f1);
		System.out.printf("f2=%f, %e, %g\n",f2,f2,f2);
		System.out.printf("f3=%f, %e, %g\n",f3,f3,f3);
		System.out.printf("%.6f\n",d);
		System.out.printf("%14.10f\n",d);
		System.out.printf("%-14.10f\n",d);
//		PrintEx1에서 [%5d]했다고 여기서도 할 필요는 없다. []는 그냥 예제에서 출력공간 자릿수 공백을 잘 보여주려고 만든 것이다.
		
		System.out.println(url.length());
//		url길이 세다가 자꾸 까먹어서 String의 길이를 출력하는 메서드를 사용했다.
		
		System.out.printf("[%s]\n",url);
		System.out.printf("[%20s]\n",url);
		System.out.printf("[%-20s]\n",url);
		System.out.printf("[%.8s]\n",url);
//		%8s는 그냥 %s와 결과가 같다
//		%-.8s는 컴파일 에러 : 아래처럼 출력공간 자릿수를 정해주면 잘린 문자열도 왼쪽정렬 옵션을 정할 수 있었다.
		System.out.printf("[%-9.8s]\n",url);
		System.out.printf("[%-20.8s]\n",url);

	}

}
