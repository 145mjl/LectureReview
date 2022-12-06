package classWrapper.Parse;

public class Main {
	public static void main(String[] args) {
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		//숫자문자열이 아닌 것을 입력하면 NumberFormatException 발생
		//자동형변환이 가능하냐 아니냐 여부는 여기에서도 적용된다.
		boolean value3=Boolean.parseBoolean("true");
		//"True" "true"를 제외하고는 모두 false를 출력한다
		//parseInt 등과는 달리 형식에 대한 예외는 발생하지 않았다. 아마도?
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
	}
}
