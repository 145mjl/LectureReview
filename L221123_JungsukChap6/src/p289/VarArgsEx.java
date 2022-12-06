package p289;

public class VarArgsEx {
	static String concatenate(String delim, String... args) {
		//deilmiter :구분 문자
		//parsing : 문장의 분석
		String result = "";
		for (String str : args) {
			result += str + delim;
		}

		return result;
	}

	public static void main(String[] args) {
		String[] strArr = new String[] { "100", "200", "300" };

		System.out.println(concatenate("", "100", "200", "300"));// 100200300
		System.out.println(concatenate("-", strArr));// 100-200-300-
		System.out.println(concatenate(",", new String[] { "1", "2", "3" }));// 1,2,3,

		
		System.out.println("[" + concatenate(",", new String[0]) + "]");// []
		System.out.println("[" + concatenate(",") + "]");// []
//		가변인자를 매개변수로 하면 아무것도 입력하지 않는 것으로도 길이가 0인 배열을 입력한 것과 같은 효과를 낸다.
//			메서드 concatenate는 모든 요소값에 delim : ","을 합친 결과를 리턴한다 → 요소값이 없으므로 "" 출력 
		
		
		System.out.println("[" + concatenate(",", null) + "]");//컴파일 에러
//		null은 가변인자(varargs) 형식에 맞지 않은 인자 - new String[0]이나 아무것도 입력하지 않는것을 권장하고 있다. 
//			[에러 메세지] Type null of the last argument to method concatenate(String,String...) doesn't exactly match the vararg parameter type. Cast to String[] to confirm the non-varargs invocation, or pass individual arguments of type String for a varargs invocation. 
//			invocation : 메서드 호출

		System.out.println("[" + concatenate(",", "") + "]");// ""가 아닌 "," 출력함. 문자열 ","과 ""의 합
		
	}
}

//향상된 for문
//for(아래단계자료형타입 임의의변수명:배열명) {
//	System.out.println(임의의변수명);→배열 요소마다 수행할 작업을 작성한다. 예시는 배열요소를 하나씩 출력하게 된다
//}

/*
 * 향상된 for문은 요소의 자료형과 배열명만 알면 되기 때문에 가변인자를 간단하게 출력할 수 있다. 가변 인자는 인자의 개수를
 * 유동적으로(0~) 하는것이 특징인데, 반복 횟수를 정해주지 않아도 되기 때문이다
 */