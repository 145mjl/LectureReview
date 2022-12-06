package p268;

class Data{int x;}

public class ReferenceReturnEx {
	static Data copy(Data d) {
		Data tmp=new Data();// Data타입의 참조변수 tmp 생성(참조하는 인스턴스 O)
		tmp.x=d.x;//tmp.x에 대입된 인자의 멤버변수 x값을 대입
		
		return tmp;
	}
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		
//		copy(d);
//			메인메서드의 Data d를 copy()의 매개변수로 입력
//				line 7 : Data타입의 참조변수 tmp생성 & 새 인스턴스 할당
//				line 8 : tmp.x에 매개변수로 입력한 d의 x 대입
//		Data d2;
//			Data타입의 참조변수 d2 생성 (참조하는 인스턴스 X)
//		d2=d;
//			tmp와 d2가 같은 인스턴스를 가리킴
		
//		이것을 한줄로 줄이면
		Data d2=copy(d);
		
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}
}

//내가 debug expression다라고 생각하고 보면 좋음
