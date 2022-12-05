package objectClass.Clone;
//얕은 복제(Shallow Copy)
class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id,String name,String password, int age, boolean adult) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
	}
	
	public Member getMember() {//Member클래스의 인스턴스를 리턴
		Member cloned=null;//참조변수 선언
		
		try {
			cloned=(Member)clone();
			//clone()은 Object클래스의 인스턴스를 리턴한다. 즉,
			//Object클래스(모든클래스의 조상클래스)의 인스턴스가 자손클래스 Member의 인스턴스로 형변환
			//조상→자손 이므로 명시적으로 형변환
		}catch(CloneNotSupportedException e) {
			//예외가 발생했을 경우 이를 처리하기 위한 문장을 적는다.
		}
		return cloned;
	}
}

public class MemberEx {
	public static void main(String[] args) {
		Member original = new Member("blue","홍길동","12345",25,true);
		
		Member cloned = original.getMember();
		cloned.password="67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : "+cloned.id);
		System.out.println("name : "+cloned.name);
		System.out.println("password : "+cloned.password);
		System.out.println("age : "+cloned.age);
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : "+original.id);
		System.out.println("name : "+original.name);
		System.out.println("password : "+original.password);
		System.out.println("age : "+original.age);
	}
}
//복제 : 원본객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성
//얕은 복제 : 참조타입필드는 번지만 복제됨 (객체의 참조변수는 새로 만들지만, 그 참조변수가 참조하는 객체는 복제 안한다는 말)
//깊은 복제 : 참조하고 있는 객체도 복제함