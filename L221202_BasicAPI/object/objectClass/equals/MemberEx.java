package objectClass.equals;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = obj1;
		Member obj3 = new Member("red");
//		Member obj4 = new Member("blue");
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
//		if(obj1.equals(obj4)) {
//			System.out.println("obj1과 obj4는 동등합니다.");
//		}else {
//			System.out.println("obj1과 obj4는 동등하지 않습니다.");
//		}
		
	}
}
//Object클래스의 equals메서드는 ==와 같은결과를 반환한다
//String클래스에서는 equals메서드를 재정의하여 주소값비교가 아닌 문자열값을 비교한다
//동일성 : 객체 인스턴스의 주소값비교 , 또는 기본형변수 비교
//동등성 : 객체 내부의 값 비교
