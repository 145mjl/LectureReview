package classStringBuilder;

public class Main {
	public static void main(String[] args) {
		String data="ABC";
		System.out.println(data);
		
		data+="DEF";
		System.out.println(data);
	}
}
//String은 불변객체(Mutable Object)
	//String str1=new String("Java");
	//→ str1은 new 키워드를 사용하여 새로운 인스턴스로 생성된다
	//String str2="Java";
	//→ str2는 ""로 생성된 String객체로 String Pool공간에 할당된다
	//String str3="Java";
	//→ 같은 값을 갖는 str3이 생성되어, String Pool에 먼저 생성된 인스턴스의 주소값이 반환된다
	//==연산자로 비교하면, str2와 3이 같은것을 확인할 수 있다
//즉 String은 불변하는 특성으로 메모리공간을 절약하고(중복 제거) 안정성을 강화한다.
//다만 문자열이 자주 수정되는 경우 Garbage Collector가 해제하기 전까지 오히려 메모리를 낭비하게 된다.

//StringBuilder, StringBuffer는 가변객체
//내부 char[]배열을 자유자재로 늘려서 사용한다
//StringBuffer는 StringBuilder와 달리 주요 메서드를 synchonized 키워드 처리한다(아직 안 배움)

//참고 https://sup2is.github.io/2020/01/29/java-immutable-object-with-string.html