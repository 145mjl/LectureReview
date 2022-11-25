package p264;

class Data {int x;}//멤버변수 : 기본형 x

public class PrimitiveParamEx {
	public static void main(String[] args) {//main 메서드가 호출 - Stack에 공간 할당,지역변수와 연산의 중간결과등이 저장됨
		Data d = new Data();//	지역변수 : 참조형 Data d, Heap에 Data클래스의 인스턴스 생성
		d.x=10;//Stack에서 메인메서드를 위한 공간에 저장된 Data d → d의 주소값을 따라가면 Heap 영역에 기본형x
		System.out.printf("main() : x = %d\n",d.x);
		
		change(d.x);//Stack에 change()를 위한 공간 할당 & change메서드의 지역변수 x=10;
		//change()의 구현부가 수행됨
		//x=1000;
		//메서드가 종료되면 Stack에서 해제되며 지역변수 x도 사라짐
		System.out.printf("After change(d.x)\nmain() : = %d ",d.x);//다시 Data d의 x
	}
	
	static void change(int x) {//Stack에서 change()메서드를 위해 할당한 공간에 저장된 기본형 x
		x=1000;//이어서 x=1000;
		System.out.printf("change() : x = %d\n",x);//x값 즉 1000을 출력
	}
}

//Debug를 실행해보면
//line 11이전의 d.x는 main메서드에 선언된 Data d가 참고하고 있는 인스턴스의 변수 x이다
//line 11에서 step into(F5)하여 change(d.x)로 점프하면 change메서드 내에 d.x는 없는 값으로 표시된다

//교재의 설명에서는 call stack과 값복사 위주로 설명하고 있는데 , 
//메서드의 매개변수는 다른 동명의 변수와 아무 상관이 없는 것과
//메서드가 종료되면 Stack에서 해제된다는 사실에 좀더 집중할 것

