package runanimal;

public class Runninganimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		//Animal클래스의 new 인스턴스를 생성
		ani1.setName("Cat");
		ani1.age=10;
		
		System.out.println(ani1.getName());
		System.out.println(ani1.age);
		
		Animal ani2 = new Animal();
//		동일한 형태의 인스턴스를 여러개 찍어낼 수 있음
		ani2.setName("Dog");
		ani2.age=15;
		
		System.out.println(ani2.getName());
		System.out.println(ani2.age);
		
		Animal ani3 = new Animal();
		ani3.setName("Parrot");
		ani3.age=20;
		
		System.out.println(ani3.getName());
		System.out.println(ani3.age);
		
		
	}
}
