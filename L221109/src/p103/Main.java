package p103;

//operator ex13번
public class Main {
	public static void main(String[] args) {
		char c1 = 'a';
//		char c2=c1+1; //컴파일 에러
		char c2 = 'a' + 1;
//		note : c1+1은 변수가 포함된 연산 - int로 자동형변환 - char변수에 대입 불가
//		'a'+1은 리터럴(수학에서 상수)간의 연산 - char변수에 대입 가능(int변수는 char보다 범위가 더 크기 때문에 'a'+1을 대입한다고 해서 컴파일 에러가 뜨지 않는다)
		
	}
}
