package package1;

public class IfExample {
	public static void main(String[] args) {
		int score=75;
		
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		/*
		 * switch문을 이용해서 구현하려면 case를 여러번 써야한다. 
		 * int연산이 버림한다는 것을 이용하여 case를 줄일수도 있다.
		 */
		
		switch(score/10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
