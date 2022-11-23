package p248;

class Card{
	private String kind;
	private int number;
	
	static int width=100;
	static int height=250;
	
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	
}


public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width ="+Card.width);
		System.out.println("Card.height ="+Card.height);
		
		Card c1=new Card();
		Card c2=new Card();
		c1.setKind("Heart");
		c1.setNumber(7);
		c2.setKind("Spade");
		c2.setNumber(4);
		
		System.out.println("c1은 "+c1.getKind()+", "+c1.getNumber()+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		System.out.println("c2는 "+c2.getKind()+", "+c2.getNumber()+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		
		
		/*
		 * c1.width와 같은 접근은 권장되지 않는다.
		 * 예제가 static변수는 공용이라는 것을 보여주기 위해서 이와 같이 접근한 것
		 */
		System.out.println("c1의 width와 height를 각각 "+c1.width+","+c1.height+"으로 변경합니다.");
		c1.width=50;
		c1.height=80;
		
		System.out.println("c1은 "+c1.getKind()+", "+c1.getNumber()+"이며, 크기는 ("+Card.width+", "+Card.height+")");
		System.out.println("c2는 "+c2.getKind()+", "+c2.getNumber()+"이며, 크기는 ("+Card.width+", "+Card.height+")");
	}
}
