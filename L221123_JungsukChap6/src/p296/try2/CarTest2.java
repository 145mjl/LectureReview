package p296.try2;

class Car{
	String color="white";
	String gearType="auto";
	int door=4;
	
	Car(String color,String gearType,int door){
		this(color);
		this.gearType=gearType;
		this.door=door;
	}
	
	Car(String color){
		this.color=color;
	}
	
	Car(){	}
}

public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.printf("c1의 color=%s, gearType=%s, door=%d\n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d\n",c2.color,c2.gearType,c2.door);
	}
}

//예제 p296과 이 코드의 차이는 그냥 취향차
