
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 ="JBEdu";
		String strVar2 ="JBEdu";
		
		if(strVar1==strVar2) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("두 문자열이 같음");
		}

		
		String strVar3 = new String("JBEdu");
		String strVar4 = new String("JBEdu");
		
		if(strVar3 == strVar4) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("두 문자열이 같음");
		}
//		new 키워드를 이용하여, Heap영역에 새로운 공간을 할당했음
//		Heap 영역에 각각 다른 인스턴스를 생성했을 것이고 주소도 다르게 될 것
	}
}
