package conOverload;
//교재 생성자 오버로딩 부분 필기
public class Car {
	String model;
	String color;
	String username;
	int cc;
	
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	
//	Car(String color,String username){
//		
//	}
//	컴파일 에러
//	예를 들어 메인메서드에서 Car c1=new Car("문자열","문자열");을 넣으면
//	두 생성자들 중 어디로 가야할지 알수없기 때문에
	
	Car(String color,int cc){
		this.color=color;
		this.cc=cc;
	}
	
	Car(int cc,String color){
		this.cc=cc;
		this.color=color;
	}
	
	public static void main(String[] args) {
		Car c1=new Car("1234",12);//Car(String color,int cc){...}로
		Car c2=new Car(13,"4321");//Car(int cc,String color){...}로
		//이렇게 타입이 일치하는 생성자를 자동 호출하는 것을 
		// --> 생성자 오버로딩이라고 한다.
		c1.color="Red";//warning 해제용
		c2.color="Blue";//warning 해제용
	}
	
}
