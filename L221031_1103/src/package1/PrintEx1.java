package package1;

public class PrintEx1 {
	public static void main(String[] args) {
		byte b=1;
		short s=20;
		char c='A';
		
		int finger =10;
		long big =100_000_000_000L; 
//		long big =100000000000L;
//		_는 가독성 측면에서 그냥 한 것임
//		L은 정수형에 아무것도 표기하지 않으면 int로 받아들이므로 long타입의 숫자다라는 표기를 한 것
		long hex=0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum =010;
		int hexNum=0x10;
		int binNum=0b10;
		
		System.out.printf("b=%d\n",b);
		System.out.printf("s=%d\n",s);
//		오답 : s는 short이므로 %d지시자 사용함 string이 아님
		System.out.printf("c=%c, %d\n",c,(int)c);
		System.out.printf("finger=%d\n",finger);
		System.out.printf("finger=[%5d]\n",finger);
		System.out.printf("finger=[%-5d]\n",finger);
		System.out.printf("finger=[%05d]\n",finger);
		//%.1d를 테스트해봤지만 (정수여서 소수점자리도 없고) 문자열이 아니라서 그런지 잘려서 출력되지는 않았다.
		System.out.printf("big=%d\n",big);
		System.out.printf("hex=%#x\n",hex);
		//#은 16진수인 경우 앞에 0x , 8진수인 경우 앞에 0을 출력하게 만든다.
		System.out.printf("octNum=%d, %o\n",octNum,octNum);
		System.out.printf("hexNum=%d, %h\n",hexNum,hexNum);
		System.out.printf("binNum=%d, %s\n",binNum,Integer.toBinaryString(binNum));
//		오답 : 변수의 순서를 잘 보고 넣을것
	}
}
