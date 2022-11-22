package inheritance.Abstract;

public class PhoneEx {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		Phone phone = new SmartPhone("홍길동");//OK
		phone.turnOn();
		phone.turnOff();
//		phone.internetSearch();//컴파일 에러
//		부모클래스타입 phone은 자식클래스 인스턴스를 참조할수는 있지만
//		부모클래스에서 정의된 멤버만 접근할 수 있다.
		
//		Phone p2=new phone("홍길동");//컴파일 에러
//		에러 메세지 : Cannot instantiate the type Phone
//		Phone타입(abstract class)의 인스턴스를 생성할 수 없다는 뜻
		
	}
}
