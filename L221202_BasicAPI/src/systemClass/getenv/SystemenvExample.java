package systemClass.getenv;

public class SystemenvExample {
	public static void main(String[] args) {
		String javaHome=System.getenv("Path");
		System.out.println("Path : "+javaHome);
	}
}
//운영체제의 환경변수를 읽어온다.
//모든 환경변수가 ;을 구분자로 하여 쭉 이어서 출력되는 것을 볼 수 있다.
//즉 문자열 parsing으로 (본인이 설정한)java 설치버전과 설치경로도 알 수 있다.