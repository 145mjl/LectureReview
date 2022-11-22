package finalEx2;

public class PersonExample {
	public static void main(String[] args) {
		Person p1=new Person("123456-1234567","KyeBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation="USA";
//		p1.ssn="654321-7654321";
//		The final field Person.nation cannot be assigned
//		The final field Person.ssn cannot be assigned
		p1.name="LeeSoonshin";
		
		System.out.println();
		System.out.println(p1.name);
		
	}
}
