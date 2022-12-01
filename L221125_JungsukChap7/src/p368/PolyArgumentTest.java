package p368;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0); // 제품가격의 10%를 보너스로 적립
	}
}

class Tv extends Product{
	Tv(){
		super(100);//Tv의 가격을 정한다
		//Tv(){this.price=100;}를 쓴 뒤, Product(){}를 따로 정의해도 같은 결과가 나오지만 이게 더 간결해보인다
		//자손생성자가 조상생성자를 호출할 때, 매개변수가 같을 필요가 없다 오개념이 잡힌것같다.
	}
	
	public String toString() {//Object클래스의 toString()오버라이딩 -> public보다 좁힐 수 X
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}
class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p +"을/를 구입하셨습니다.");//toString()을 오버라이딩하여 객체 출력이 가능하겠다
	}
}


public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money+"만 원입니다.");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");//대소문자에 주의
	}
}
