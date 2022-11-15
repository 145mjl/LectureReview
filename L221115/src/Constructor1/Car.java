package Constructor1;

public class Car {
	String company="Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
	}
	
	Car(String model){
		this.model=model;
	}
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	int plus(int x,int y) {
		int result = x+y;
		return result;//return을 만나면 무조건 실행흐름이 메서드를 호출했던 부분으로 점프함
		
//		System.out.println(result);//unreachable code : 절대 도달할 수 없는 (절대 실행될 수 없는) 코드
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : "+car1.company);
		
		Car car2 = new Car("Sonata");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		
		Car car3 = new Car("Sonata","Red");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		
		Car car4 = new Car("Sonata","Red",190);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		
	}

}
//debug
//인스턴스 생성하는 행에서 F5를 누르면 생성자로 이동된다
//note
//System.out.println("car1.company : "+car1.company);에서 F5를 누르면 
//생성자가 아니라 println메서드 설명으로 넘어간다

//expressions에 멤버변수(company,model,color,maxSpeed)를 추가한 뒤 debug를 해보기
//예를 들어 line 45에서 Step into하면
//line19 생성자를 실행 중에는 멤버변수의 값이 생기지만
//종료되면 전부 해제되는것을 볼 수 있음

//한편 car1.company 등은 남는데
//지역변수가 아니어서 --> X
//객체의 인스턴스 속에 저장됨 --> O

//Car의 멤버변수는 그럼 
//car1.company, car2.company, ... 인가? -->X
//멤버변수는 Car라는 틀에 있는 멤버 중 변수를 의미함
