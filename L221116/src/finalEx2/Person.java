package finalEx2;

public class Person {
	final String nation="Korea";
	final String ssn;
	String name;
//	ssn은 아직 초기화 1번 가능함
	

//	Person클래스 외부에서 ssn변수를 초기화시키고 싶다면?
	public Person(String ssn,String name) {
		this.ssn=ssn;
		this.name=name;
	}
//	생성자메서드를 통해 1번째 초기화하도록 함
//	-->인스턴스 생성할때(생성자가 호출되므로) 값이 고정된다

	
	
//	public void setSSn(String ssn) {
//		this.ssn=ssn;
//	}
//	The final field Person.ssn cannot be assigned
//	<--Person클래스의 멤버 ssn은 이제 변경 불가능 
}

