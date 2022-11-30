package p346;

class Card{
	final String KIND;
	final int NUMBER;
	static int width=100;
	static int height=250;
	
	Card(String kind,int num){
		KIND=kind;
		NUMBER=num;
	}
	
	Card(){
		this("HEART",1);
	}
	
	public String toString() {
		return KIND + " "+ NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("HEART",10);
//		c.NUMBER=5;
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The final field Card.NUMBER cannot be assigned
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c.toString());
		//Overrides: toString() in Object
		//따라서 p346.Card@어쩌구 대신 HEART 10을 출력한다.
		
		System.out.println(c);
		//void java.io.PrintStream.println(Object x) : x.toString()메서드를 호출한다.
		//Overload : println메서드
		
	}
}
