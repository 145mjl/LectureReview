package package1;
public class DoWhileExample2 {
	public static void main(String[] args) {
		int i=1;
		
		do {
			System.out.println(i++);
		}while(i<=0);
	}
}
//한번 실행되어 1이 출력됨
//반면 while문은 실행되지 않는다.
