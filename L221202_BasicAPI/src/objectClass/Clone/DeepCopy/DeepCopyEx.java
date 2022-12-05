package objectClass.Clone.DeepCopy;

import java.util.Arrays;

class Car{
	public String model;
	public Car(String model) {
		this.model=model;
	}
}
class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name,int age,int[] scores,Car car) {
		this.name=name;
		this.age=age;
		this.scores=scores;
		this.car=car;
	}
	
	//아래는 메서드 전체에 try{}catch(CloneNotSupportedException e){}문이 걸려있는것과 같다.
	//메서드 오버라이딩 : protected 이하로 접근범위를 좁힐 수 없다.
	//Object는 리턴타입이다.
	protected Object clone() throws CloneNotSupportedException{
		Member cloned=(Member)super.clone();
		
		//***깊은 복제 핵심(없으면 얕은 복제)
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length);//배열 복사
		cloned.car=new Car(this.car.model);//original.car과 필드값이 동일한 새로운 Car 객체 생성
		
		return cloned;
	}
	
	public Member getMember() {//Member클래스의 인스턴스를 리턴
		Member cloned=null;//참조변수 선언
		
		try {
			cloned=(Member)clone();//***위쪽 메서드를 호출하여 Member클래스의 인스턴스를 리턴받음
			//Object클래스(모든클래스의 조상클래스)의 인스턴스가 자손클래스 Member의 인스턴스로 형변환
		}catch(CloneNotSupportedException e) {
			//예외가 발생했을 경우 이를 처리하기 위한 문장을 적는다.
		}
		return cloned;
	}
}

public class DeepCopyEx {
	public static void main(String[] args) {
		Member original = new Member("홍길동",25,new int[] {90,80},new Car("소나타"));
		
		Member cloned = original.getMember();
		cloned.scores[0]=101;
		cloned.car.model="K5";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : "+cloned.name);
		System.out.println("age : "+cloned.age);
		System.out.print("scores: {");
		for(int i=0;i<cloned.scores.length;i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length - 1))?"":",");
		}
//		System.out.println(Arrays.toString(cloned.scores));//위 for문과 같은 기능을 한다
		System.out.println("}");
		System.out.println("car: "+cloned.car.model);
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : "+original.name);
		System.out.println("age : "+original.age);
		System.out.print("scores: {");
		for(int i=0;i<original.scores.length;i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length - 1))?"":",");
		}
		System.out.println("}");
//		System.out.println(Arrays.toString(original.scores));//위 for문과 같은 기능을 한다
		System.out.println("car: "+original.car.model);
		System.out.println();
	}
}
