package p343;

import static java.lang.System.out;
//지금단계에서는 println을 많이 쓰기 때문에 해당 import문이 유용하지만 , 나중에는 출력할일이 별로 없으므로 (GUI를 씀) 잘 쓰지 않는다
import static java.lang.Math.*;

public class StaticImportEx1 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		out.println(random());
		System.out.println("Math.PI : "+Math.PI);
		out.println("Math.PI :"+PI);
		//스캐너를 import해도 메인메서드에서 Scanner sc=new Scanner(생략);이나 스캐너클래스변수명.next(); 와 같이 작성했듯이 out도 안 쓸 수는 없다.
	}
}
