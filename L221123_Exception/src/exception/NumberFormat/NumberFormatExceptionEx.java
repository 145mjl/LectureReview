package exception.NumberFormat;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		String data1="100";
		String data2="a100";
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);//"a100"이 정수가 아님→예외발생
		int result=value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
	}
}

//디버그 실행시 F5를 눌러보면 line 9 에서 Integer.class의 parseInt메서드로 이동한다

//if (digit < 0 || result < multmin) {
//    throw NumberFormatException.forInputString(s, radix);
//}