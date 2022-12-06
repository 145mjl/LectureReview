package p276;

public class PowerTest {
	static long powerTest(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x*powerTest(x,--n);
	}
	
	//재귀호출을 쓰지않는경우
	//Math.pow()메서드를 사용해도 된다.
	static long powerTest2(int x,int n) {
		int testPow=x;
		for(int i=n;i>1;i--) {
			testPow*=x;
		}
		return testPow;
	}
	
	public static void main(String[] args) {
		int x=2;
		int n=5;
		int sum=0;
		
		System.out.println(powerTest2(x,n));
		
		for(int i=1;i<=n;i++) {
			sum+=powerTest(x,i);
		}
		
		System.out.println(sum);
	}
}

//for반복문을 도는 중에는 x(밑)은 그대로지만 지수는 1부터 n까지 증가해야 한다
//-->sum+=powerTest(x,i);