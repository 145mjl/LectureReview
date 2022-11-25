package p267;

public class ReturnTest {
	static void add(int a,int b,int[] result) {
		result[0]=a+b;
	}
	static int add(int a,int b) {
		return a+b;
	}

	
	
	public static void main(String[] args) {
		int a=2;
		int b=6;
		int result=ReturnTest.add(a,b);
		int[] resultAr= {0};
		ReturnTest.add(a, b,resultAr);
		
		System.out.println(result);
		System.out.println(resultAr[0]);

	}
}
