package classWrapper.AutoBoxingUnboxing;

public class Main {
	public static void main(String[] args) {
		//Wrapper클래스는 다음과 같이 명시적 형변환 없이 기본형의 값을 대입(자동바깅)받거나, 그 반대도 가능(자동언박싱)하다
		
		//자동 Boxing
		Integer obj=100;
		System.out.println("value : "+obj.intValue());
		
		//대입 시 자동 Unboxing
		int value = obj;
		System.out.println("value : "+value);
		
		//연산 시 자동 Unboxing
		int result = obj+100;
		System.out.println("result : "+result);
	}
}
//첫번째 단락을 메모리로 하면 아마도
//obj참조변수 인스턴스에 100이 저장
//obj.intValue() 하여 100을 새로이 생성된 기본형변수에 저장