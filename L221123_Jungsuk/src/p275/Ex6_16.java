package p275;

public class Ex6_16 {
	static long factorial(int n) {
		if(n<=0||n>20) {
			return -1;
		}
		if(n<=1) {
			return 1;
		}
		return n*factorial(--n);
	}
	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			System.out.printf("%d!=%d\n",i,factorial(i));
		}
	}
}

//무한반복문이 break문이 필요하듯이 재귀함수도 조건문으로 제약을 걸어야함
//if(n<=1) {
//return 1;
//}
//<--n이 1일때까지만 반복하도록 조건문을 걸고, 1!=1이므로 return값은 1으로 한다.

//if(n<=0||n>20) {
//	return -1;
//}
//n이 0 이하거나 20초과이면 -1을 리턴한다.
//<--0에 무엇을 곱하든 0이 되고
//<--n이 20을 넘어가면 long의 범위를 넘어가기 때문
