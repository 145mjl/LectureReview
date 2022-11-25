package p298;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
	}
	
	Car(Car c){
		this(c.color,c.gearType,c.door);
	}
	
	Car(String color,String gearType,int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
}

public class CarTest3 {
	public static void main(String[] args) {
		Car c=new Car();
		Car c2=new Car(c);
		
		System.out.printf("c의 color=%s , gearType=%s , door=%d이다\n",c.color,c.gearType,c.door);
		System.out.printf("c2의 color=%s , gearType=%s , door=%d이다\n",c2.color,c2.gearType,c2.door);
		
		c.door=100;
		System.out.printf("c.door 변경후 c의 color=%s , gearType=%s , door=%d이다\n",c.color,c.gearType,c.door);
		System.out.printf("c.door 변경후 c2의 color=%s , gearType=%s , door=%d이다\n",c2.color,c2.gearType,c2.door);
	}

}
