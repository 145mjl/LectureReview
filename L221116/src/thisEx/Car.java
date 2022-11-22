package thisEx;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model=model;
	}

	public void setSpeed(int speed) {
		this.speed=speed;
//		speed=speed;
//		The assignment to variable speed has no effect
//		-->두 speed는 모두 setSpeed의 매개변수 speed이다
//		-->변수에 변수자신을 대입하므로 아무런 효과가 없는 코드이다
		
//		반면에 this.speed는 Car클래스의 멤버변수
	}

	
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다. (시속 : "+this.speed+"km/h)");
		}
	}
	
	public static void main(String[] args) {
		Car c1=new Car("Hyundai");
		Car c2=new Car("BMW");
		
		c1.run();
		c2.run();
	}
	
}
