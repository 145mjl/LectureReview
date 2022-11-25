package p320;

class Deck{
	//멤버변수 : 카드 1벌
	//메서드 : pick, pick(오버로딩) , shuffle
	final int CARD_NUM=52;
	Card cardArr[] = new Card[CARD_NUM];
	//카드클래스의 객체배열 생성
	//4종 13장이므로 배열길이 52
	
	Deck() {//기본 생성자 - 객체배열의 요소(=Card 객체)를 초기화한다. 클로버1~K 하트1~K 다이아1~K 스페이드1~K 순서
		int i=0;
		
		for(int k=Card.KIND_MAX;k>0;k--) {
			for(int n=0;n<Card.NUM_MAX;n++) {
				cardArr[i++]=new Card(k,n+1);
			}
		}
	}
	
	Card pick(int index) {//index번째 Card를 뽑는다.
		return cardArr[index];
	}
	
	Card pick() {//아무것도 입력하지 않으면 랜덤하게 뽑는다.
		int index=(int)(Math.random()*CARD_NUM);//0<= <52의 숫자 생성 (총52개)
		return pick(index);//바로 위의 메서드를 사용하여 값리턴
	}
	
	void shuffle() {
		for(int i=0;i<cardArr.length;i++) {
			int r=(int)(Math.random()*CARD_NUM);
			//셔플 구현부를 보면 알겠지만 뽑은 카드를 제외하는 기능은 없음
			Card temp=cardArr[i];
			cardArr[i]=cardArr[r];
			cardArr[r]=temp;
		}
	}
}

class Card{
	//멤버변수 : 종류값, 숫자값 
	//메서드 : 카드정보 출력
	static final int KIND_MAX=4;
	static final int NUM_MAX=13;

	static final int SPADE=4;
	static final int DIAMOND =3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card(){
		this(SPADE,1);
	}
	
	Card(int kind, int number){
		this.kind=kind;
		this.number=number;
	}
	
	public String toString() {
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers="0123456789XJQK"; //조커?-123456789-10-잭-퀸-킹
		return "kind : "+kinds[this.kind]+" ,number : "+numbers.charAt(this.number);
	}
	//멤버변수 kind가 1,2,3,4면 클로버,하트,다이아몬드,스페이드를 리턴 (배열 인덱스는 0부터이므로 편의상 kinds[0]=""로 지정)
	//멤버변수 number와 매치하는 숫자'문자' 리턴
	//문자열+문자열+문자열+문자 → 자동형변환으로 문자열
}


public class DeckTest {
	public static void main(String[] args) {
		Deck d=new Deck();
		Card c=d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c=d.pick(0);
		System.out.println(c);
	}
}
