package classClass;

class Car{
	private int speed=0;
	
	Car(int speed){
		this.speed=speed;
	}
}

public class ClassInfoExample {
	public static void main(String[] args) {
		Car car =new Car(100);
		Class clazz=car.getClass();
		System.out.println(clazz.getName());//패키지이름.클래스이름
		System.out.println(clazz.getSimpleName());//클래스이름만
		System.out.println(clazz.getPackage().getName());//패키지이름
	}
}
//검색 : raw type
//제네릭 타입에서 타입 매개변수를 전혀 사용하지 않는 타입
//타입 정보가 전부 지워진 것처럼 동작함

//generic type(제네릭 클래스,제네릭 인터페이스)란
//Class<T> 어쩌고 = ... 처럼 쓴다
//<>안의 변수를 타입매개변수라고 한다