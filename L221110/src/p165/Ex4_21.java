package p165;

public class Ex4_21 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.println("["+i+","+j+"]");
				}else {
//					System.out.printf("%5c",'?')//콘솔창디버깅용
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
	}
}
