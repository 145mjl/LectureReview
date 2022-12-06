package p371;

class Product{
	int price;
	int bonusPoint;
	
	Product(){}
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0); 
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	
	public String toString() {
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
class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}


class Buyer{
	int money=1000;
	int bonusPoint=0;
	Product[] item=new Product[10];
	int i=0;//객체배열 카운터
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p;//매개변수로 받은 인스턴스 주소를 객체배열에도 저장한다.
		System.out.println(p +"을/를 구입하셨습니다.");
		//***Product에는 toString()메서드가 있다 - 최상위클래스인 Object클래스의 메서드이므로***
		//그러므로 메서드의 매개변수가 Product p 이지만, new Tv(), new Computer(), new Audio()에서 재정의한대로 출력해준다.
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum+=item[i].price;//각 객체별 price멤버변수를 더한다.
			itemList+=item[i]+", ";//문자열 누적합
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}


public class PolyArgumentTest2ObjectArray {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
		//이전 예제는 b.money와 b.bonusPoint에 직접접근하는데 반해 b.summary는 내부에서 출력해주고 있음 -> 더 객체 지향적
	}
}
//그동안은 문제를 풀때 메인메서드에서 객체배열을 선언하였음
//다른 클래스에 객체배열, 각 객체의 특정 멤버변수의 합 구하는 메서드 등을 어떻게 정리하는지 참고하자
