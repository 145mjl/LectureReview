package p271;

public class Ex6_15Factorial {
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		return (n)*fact(--n);
	}
	
	public static void main(String[] args) {
		Ex6_15Factorial m1=new Ex6_15Factorial();
		System.out.println(m1.fact(5));
	}
}

//error
//리턴타입을 정하지 않으면
//정수값*fact(정수) 연산을 할 수 없다는 메세지가 뜬다
//-->리턴타입 int인 메서드로 변경

//error
//만약 return n*fact(n--);으로 작성하면 재귀호출시 n이 감소하지 않아 무한반복한다.
//수정 -->
//n--;
//return (n+1)*fact(n-1);

//개선
//-->한줄로 줄이면 return n*fact(n-1)
//or --> return n*fact(--n);

//note
//전치 증감연산자를 쓰면 무한반복하지 않는다
//--n은 값감소-->연산참여
//n--은 연산참여-->값감소
//추측-->fact(5)가 무한히 호출되어 컴파일 에러 발생